package org.formation.documents.controller;

import java.util.List;
import java.util.logging.Logger;

import org.formation.documents.model.Document;
import org.formation.documents.model.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * A RESTFul controller for accessing Document information.
 * 
 * @author David Thibau from Paul Chapman
 */
@RestController
public class DocumentsController {

	protected Logger logger = Logger.getLogger(DocumentsController.class
			.getName());
	protected DocumentRepository documentRepository;

	/**
	 * @param documentRepository
	 */
	@Autowired
	public DocumentsController(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;

		logger.info("DocumentRepository says system has "
				+ documentRepository.countDocuments() + " Documents");
	}



	/**
	 * @param owner
	 * @return
	 */
	@RequestMapping("/Documents/owner/{name}/"  )
	public List<Document> getDocuments(@PathVariable("name") String owner) {
		logger.info("Documents-service byOwner() invoked: "
				+ documentRepository.getClass().getName() + " for "
				+ owner);

		List<Document> documents = documentRepository
				.findByOwner(owner);
		logger.info("Documents-service byOwner() found: " + documents );

		return documents;
		
	}
	
	@RequestMapping("/Documents")
	public List<Document> getAllDocuments() {
		logger.info("Documents-service getAll() invoked: ");

		List<Document> documents = documentRepository
				.findAll();
		logger.info("Documents-service byOwner() found: " + documents );

		return documents;
		
	}


}
