package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class BIM_SMARTCITY {
    /**
     * <p>The ontology model that holds the vocabulary terms</p>
     */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);

    /**
     * <p>The namespace of the vocabulary as a string</p>
     */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/bim/smartcity#";

    /**
     * <p>The namespace of the vocabulary as a string</p>
     *
     * @return namespace as String
     * @see #NS
     */
    public static String getURI() {
        return StringUtils.stripEnd(NS, "#");
    }

    /**
     * <p>The namespace of the vocabulary as a resource</p>
     */
    public static final Resource NAMESPACE = M_MODEL.createResource(NS);

    /**
     * <p>The ontology's owl:versionInfo as a string</p>
     */
    public static final String VERSION_INFO = "http://www.symbiote-h2020.eu/ontology/bim/smartcity";

    public static String getVersionURI() {
        return getURI();
    }

 /**
      #################################################################
      #
      #    Object Properties and Data Properties
      #
      #################################################################
 **/

	public static final DatatypeProperty name = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#name" );

    public static final DatatypeProperty id = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#id" );

    public static final DatatypeProperty status = M_MODEL.createDatatypeProperty( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#status" );

/**
 #################################################################
 #
 #    Classes
 #
 #################################################################
 **/

    /**
     * ############ Sensors
     **/

    public static final OntClass AirQualitySensor = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#AirQualitySensor");

    public static final OntClass HumiditySensor = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#HumiditySensor");

    public static final OntClass LightSensor = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#LightSensor");

	public static final OntClass LightPoint = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#LightPoint");

    public static final OntClass TemperatureSensor = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#TemperatureSensor");



    /**
     * ############ City class
     **/

	public static final OntClass City = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#City");

    /**
     * ############ Parking and Lighting classes
     **/

	public static final OntClass refParkingSite = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#refParkingSite");

    public static final OntClass ParkingSpot = M_MODEL.createClass("http://www.symbiote-h2020.eu/ontology/bim/smartcity#ParkingSpot");


    /**
     * #################################################################
     * #
     * #    Individuals
     * #
     * #################################################################
     **/

    public static final Individual onOffState = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#onOffState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual category = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#category", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual powerState = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#powerState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual lanternHeight = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#lanternHeight", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual illuminanceLevel = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#illuminanceLevel", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual powerConsumption = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#powerConsumption", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual current = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#current", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual powerRating = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#powerRating", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual powerFactor = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#powerFactor", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual voltage = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#voltage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual width = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#width", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual length = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#length", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual refParkingGroup = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#refParkingGroup", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual refStreetlightControlCabinet = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#refStreetlightControlCabinet", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual refStreetlightGroup = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#refStreetlightGroup", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual locationCategory = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#locationCategory", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual temperature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#temperature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual feelsLikesTemperature = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#feelsLikesTemperature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual relativeHumidity = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#relativeHumidity", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual precipitation = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#precipitation", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual solarRadiation = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#solarRadiation", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual pressureTendency = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#pressureTendency", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual dewPoint = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#dewPoint", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual streamGauge = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#streamGauge", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual snowHeight = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#snowHeight", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual uVIndexMax = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#uVIndexMax", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual aqiMajorPollutant = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#aqiMajorPollutant", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual aqiMajorPollutantForecast = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#aqiMajorPollutantForecast", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual airTemperatureForecast = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#airTemperatureForecast", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual precipitationForecast = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#precipitationForecast", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual airQualityIndex = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#airQualityIndex", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual relativeHumidityForecast = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#relativeHumidityForecast", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual illuminance = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#illuminance", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual airQualityIndexForecast = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#airQualityIndexForecast", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual airTemperatureTSA = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#airTemperatureTSA", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual dayMaximum = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#dayMaximum", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual dayMinimum = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/bim/smartcity#rdayMinimum", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

    public static final Individual paid = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#paid", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual state = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#state", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual Isprotected = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#Isprotected", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual windSpeed = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#windSpeed", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual co = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#co", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual co2 = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#co2", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual dry = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#dry", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual rainPercentage = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#rainPercentage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual pm2_5 = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#pm2_5", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
    public static final Individual atmosphericPressure = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/bim/smartcity#atmosphericPressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

}