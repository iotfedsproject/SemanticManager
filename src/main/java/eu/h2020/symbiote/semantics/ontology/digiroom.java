package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class digiroom {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/digiroom#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v1.0.0 2020/12/10 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/1.0.0"; }
	
	//http://www.symbiote-h2020.eu/ontology/digiroom#digiroom
	public static final OntClass digiroom = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/digiroom#digiroom" );
	
	
	// Individuals
	
	public static final Individual action = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/digiroom#action", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual creator = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/digiroom#creator", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual callinfos = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/digiroom#callinfos", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual endtime = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/digiroom#endtime", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual roomid = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/digiroom#roomid", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual settings = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/digiroom#settings", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual starttime = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/digiroom#starttime", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
}
