package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class pal {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/pal#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v1.0.0 2020/12/10 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/1.0.0"; }
	
	//http://www.symbiote-h2020.eu/ontology/pal#pal
	public static final OntClass pal = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/pal#pal" );
	
	
	// Individuals
	
	public static final Individual shapesid = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/pal#shapesid", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual interaction_duration = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/pal#interaction_duration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual activity_id = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/pal#activity_id", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual activity_name = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/pal#activity_name", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual emotion = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/pal#emotion", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual status_code = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/pal#status_code", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual timestamp = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/pal#timestamp", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
}
