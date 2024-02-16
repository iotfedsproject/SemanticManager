package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class scify {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/scify#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v1.0.0 2020/12/10 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/1.0.0"; }
	
	//http://www.symbiote-h2020.eu/ontology/scify#scify
	public static final OntClass scify = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/scify#scify" );
	
	
	// Individuals
	
	public static final Individual article_name = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/scify#article_name", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual category = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#category", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual errors_num = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#errors_num", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual exercise_difficulty = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#exercise_difficulty", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual game_level = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#game_level", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual filter = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#filter", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual language = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#language", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual num_of_cards = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#num_of_cards", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	 
	public static final Individual time_to_complete_seconds = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#time_to_complete_seconds", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
    public static final Individual time_in_seconds = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#time_in_seconds", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    //newly added
    public static final Individual lang = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#lang", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual source = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#source", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual version = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#version", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual category_name = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#category_name", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual parent_category_name = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#parent_category_name", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual gameName = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#gameName", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual gameType = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#gameType", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual mistakes = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#mistakes", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual duration = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#duration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual name = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#name", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual gameDuration = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#gameDuration", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual gameLevel = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#gameLevel", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual numOfErrors = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#numOfErrors", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual payload = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/scify#payload", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );



}
