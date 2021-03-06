package fr.insee.rmes.metadata.repository;

import java.util.List;
import java.util.Map;

import fr.insee.rmes.metadata.model.ColecticaItem;
import fr.insee.rmes.metadata.model.ColecticaItemPostRef;
import fr.insee.rmes.metadata.model.ColecticaItemPostRefList;
import fr.insee.rmes.metadata.model.ColecticaItemRefList;
import fr.insee.rmes.metadata.model.Unit;

public interface MetadataRepository {

	ColecticaItem findById(String id) throws Exception;

	ColecticaItemRefList getChildrenRef(String id) throws Exception;

	List<ColecticaItem> getItems(ColecticaItemRefList refs) throws Exception;
	
	Map<ColecticaItemPostRef,String> postNewItems(ColecticaItemPostRefList refs) throws Exception;
	
	Map<ColecticaItemPostRef,String> postNewItem(ColecticaItemPostRef ref) throws Exception;
	
	Map<ColecticaItemPostRef,String> postUpdateItems(ColecticaItemPostRefList refs) throws Exception;
	
	Integer getLastestVersionItem(String id) throws Exception;

	List<Unit> getUnits() throws Exception;
}
