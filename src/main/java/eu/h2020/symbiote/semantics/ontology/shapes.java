package eu.h2020.symbiote.semantics.ontology;
import org.apache.jena.rdf.model.*;
import org.apache.jena.ontology.*;

import org.apache.commons.lang3.StringUtils;

public class shapes {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static final OntModel M_MODEL = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.symbiote-h2020.eu/ontology/shapes#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     * @return namespace as String
     * @see #NS */
    public static String getURI() {return StringUtils.stripEnd(NS, "#");}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = M_MODEL.createResource( NS );
    
    /** <p>The ontology's owl:versionInfo as a string</p> */
    public static final String VERSION_INFO = "v1.0.0 2020/12/10 12:00:00";
    
    public static String getVersionURI() { return getURI() + "/1.0.0"; }
	
	public static final OntClass AirQualitySensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#AirQualitySensor" );
	
	public static final OntClass BodyScale = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#BodyScale" );
	
    public static final OntClass BloodPressureMeter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartshapes#BloodGlucoseMeter" );

    public static final OntClass BloodPressureSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/bim/smartshapes#BloodPressureSensor" );

	public static final OntClass BloodGlucoseMeter = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#BloodPressureMeter" );
    
	public static final OntClass Camera3D = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#Camera3D" );

	public static final OntClass EnergyMonitor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#EnergyMonitor" );
	
	public static final OntClass EnvironmentalSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#EnviromentalSensor" );
	 
	public static final OntClass FitnessTracker = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#FitnessTracker" );
	
	public static final OntClass GaitMeasureDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#GaitMeasureDevice" );
	
	public static final OntClass HealthDevice = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#HealthDevice" );
	
	public static final OntClass HeartRateMonitor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#HeartRateMonitor" );
	
	public static final OntClass HumiditySensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#HumiditySensor" );
	
	public static final OntClass LampMonitor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#LampMonitor" );
	
	public static final OntClass MotionSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#MotionSensor" );
	
	public static final OntClass MovementSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#MovementSensor" );
	
	public static final OntClass Omron_M7 = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#Omron_M7" );
	
	public static final OntClass Omron_oxi = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#Omron_oxi" );
	
	public static final OntClass Omron_Viva = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#Omron_Viva" );

	public static final OntClass OxymeterSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#OxymeterSensor" );

	public static final OntClass ScaleSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#ScaleSensor" );
	
	public static final OntClass SmartBand = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#SmartBand" );
	
	public static final OntClass TemperatureSensor = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#TemperatureSensor" );
	
	public static final OntClass WeightScale = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#WeightScale" );
	
	public static final OntClass WeatherStation = M_MODEL.createClass( "http://www.symbiote-h2020.eu/ontology/shapes#WeatherStation" );
	
	public static final Individual activityState = M_MODEL.createIndividual( "http://www.symbiote-h2020.eu/ontology/shapes#activityState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual airHumidity = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#airHumidity", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	 
	public static final Individual airTemperature = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#airTemperature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual averageWindSpeed = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#averageWindSpeed", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual BasalMetabolicRate = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#BasalMetabolicRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual batteryVoltage = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#batteryVoltage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual bloodGlucose = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#bloodGlucose", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual bloodPressure = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#bloodPressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual body_fat_percentage = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#body_fat_percentage", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual body_mass_index = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#body_mass_index", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual body_metabolic_rate = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#body_metabolic_rate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual body_skeletal_muscle = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#body_skeletal_muscle", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual body_weight = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#body_weight", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual body_visceral_fat = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#body_visceral_fat", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual cadence = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#cadence", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual CO2eq = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#CO2eq", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual diastolicBloodPressure = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#diastolicBloodPressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual diastolic_blood_pressure = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#diastolic_blood_pressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual distance = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#distance", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual endPosition = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#endPosition", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual Falls = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#Falls", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual heartRate = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#heartRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual heart_rate = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#heart_rate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual humidity = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#humidity", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual gustWindSpeed = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#gustWindSpeed", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual OnOffState = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#OnOffState", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual oxygen_saturation = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#oxygen_saturation", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual Performance = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#Performance", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	 
	public static final Individual repetitions = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#repetitions", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual rainRate = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#rainRate", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual routines = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#routines", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual SGID = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#SGID", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual solarRadiation = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#solarRadiation", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual startPosition = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#startPosition", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual steps = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#steps", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual steps_count = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#steps_count", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual systolicBloodPressure = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#systolicBloodPressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );

	public static final Individual systolic_blood_pressure = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#systolic_blood_pressure", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual temperature = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#temperature", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual todaysRain = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#todaysRain", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual TVOC = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#TVOC", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
	public static final Individual windDirection = M_MODEL.createIndividual("http://www.symbiote-h2020.eu/ontology/shapes#windDirection", M_MODEL.createClass( "http://www.w3.org/2002/07/owl#NamedIndividual" ) );
	
}
