package log.custom;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;

import vanetsim.map.Map;
import vanetsim.map.Region;
import vanetsim.scenario.Vehicle;

public class LogVehicleData {
	private Writer writer = null;
	private String outputFileName = "logs/log_output.txt" ;
	private static String fileWriterFileName = "logs/vehicle_street_log.txt";
	public static FileWriter fileWriter; 
	
//	public LogVehicleData(){
//		
//	    try {
//			writer = new BufferedWriter(new OutputStreamWriter(
//			          new FileOutputStream(outputFileName), "utf-8"));
//			
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	/**
	 * This Method is a helper method to get all the vehicles active or inactive in the map
	 * Map has all the regions and regions has all the vehicles.
	 * 
	 * @returns an arraylist of Vehicles
	 */
	
//	public ArrayList<Vehicle> getAllVehicle(){
//		
//		ArrayList<Vehicle> allVehicles = new ArrayList<>();
//		
//		
//		Region[][] regions = Map.getInstance().getRegions();
//		Vehicle[] vehicles;
//		Vehicle vehicle;
//		int i, j, k;
//		int activeVehicles = 0;
//		int travelledVehicles = 0;
//		int wifiVehicles = 0;
//		long messagesCreated = 0;
//		long IDsChanged = 0;
//		double messageForwardFailed = 0;
//		double travelDistance = 0;
//		double travelTime = 0;
//		double speed = 0;
//		double knownVehicles = 0;
//		for(i = 0; i < regions.length; ++i){
//			for(j = 0; j < regions[i].length; ++j){
//				vehicles = regions[i][j].getVehicleArray();	
//				
//				
//				for(k = 0; k < vehicles.length; ++k){
//					vehicle = vehicles[k];
//					allVehicles.add(vehicle);					
//
//				}
//			}
//		}
//		
//		System.out.println("\n Total " + allVehicles.size() + " Vehicles are on the Map");
//        return allVehicles;
//			
//		
//	}
	
//	public void updateLog(){	
//		
//		try {
//
//		    writer.write("Something\n");
//		    writer.write("new line\n");
//		} catch (IOException ex) {
//		  // report
//		} finally {
//		   try {writer.close();} catch (Exception ex) {/*ignore*/}
//		}
//	   System.out.println("File output over");
//		
//	}
	
//	public void writeVehicleInfo(ArrayList<Vehicle> vehicles){
//		
//		
//		Vehicle vehicle;
//		int i, j, k;
//		int activeVehicles = 0;
//		int travelledVehicles = 0;
//		int wifiVehicles = 0;
//		long messagesCreated = 0;
//		long IDsChanged = 0;
//		double messageForwardFailed = 0;
//		double travelDistance = 0;
//		double travelTime = 0;
//		double speed = 0;
//		double knownVehicles = 0;
//		
//		try {
//			for(k = 0; k < vehicles.size(); ++k){
//				
//				vehicle = vehicles.get(k);
//				    // steady id is fixed device id. whereas geID is relative chanageable VehicleID
//					writer.write(vehicle.getStedyID()+"");
//					writer.write(" ");		
//					
////					writer.write(vehicle.getID()+"");
////					writer.write(" ");
//					writer.write(vehicle.getTotalTravelDistance()+"");
//					writer.write(" ");
//					writer.write(vehicle.getTotalTravelTime()+"");
//					writer.write(" ");
//					writer.write(vehicle.totalWaitTime+"");
//					writer.write("\n");
//				} 
//
//		}catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//
//	
//		
//	}
	
//	public void logAllVehicleInfo(String fileName){
//		outputFileName = fileName;
//		logAllVehicleInfo();		
//	}
    
	
//	public void logAllVehicleInfo(){
//		
//		LogVehicleData logVehicleData = new LogVehicleData();
//		System.out.println("\n\n ****Going to call VehicleInfo\n");
//		// No parameter is needed. getting all the vehicles from globar map instances
//		ArrayList<Vehicle> vehiclesList = logVehicleData.getAllVehicle();
//		logVehicleData.writeVehicleInfo(vehiclesList);	
//		
//	}
    
	public static void initialFileWriter(String fileWriterFileName){
		try {
			System.out.println("initiallizying file writere: filename: " + fileWriterFileName);
			fileWriter = new FileWriter(fileWriterFileName, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public static void writeVehicleStreetInfo(Vehicle vehicle){
//    	System.out.println("write vehicle street method is called");
    	try {   		
    		
//    		System.out.println("in try method to write");
			fileWriter.write("" + vehicle.getStedyID()+" ");
			fileWriter.write( "vtdis:" + vehicle.getTotalTravelDistance()/100+" "); // length in meter
			fileWriter.write( "vtt:" + vehicle.getTotalTravelTime()/1000+" ");
			fileWriter.write( "vtwt:" + vehicle.totalWaitTime/1000+" ");
////			fileWriter.write( "vtspeed:" + (vehicle.getTotalTravelDistance()/100/1000)/(vehicle.getTotalTravelTime()/1000/3600)+" ");
//			fileWriter.write("maxTF:" + vehicle.maxTrafficSignalWaitTime/1000 + " ");
//			fileWriter.write("myTF:" + vehicle.myTrafficSignalWaitTime/1000 + " ");
//			fileWriter.write( "vsstops:" + vehicle.vehicleStreetInfoList.size()+" ");
//			
//			for(int i=0; i < vehicle.vehicleStreetInfoList.size(); i++){
//				VehicleStreetInfo vehicleStreetInfo = vehicle.vehicleStreetInfoList.get(i);
////				fileWriter.write( "sn:" + vehicleStreetInfo.street.getName()+" ");
//				fileWriter.write( "sl:" + (int)(vehicleStreetInfo.street.getLength()/100)+" ");
//				fileWriter.write( "tt:" + (int)(vehicleStreetInfo.totalTime/1000)+" ");
//				fileWriter.write( "wt:" + (int)(vehicleStreetInfo.totalWaitTime/1000)+" ");
//								
//			}

			
			fileWriter.write("\n");
			fileWriter.flush();
//			System.out.println("write vehicle street method has flushed");
//			fileWriter.close();
			

			System.out.println("log flushed to file");
		
		}
    	catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
    	
    }
    
    
    
//    public static void writeVehicleStreetInfo(Vehicle vehicle){
//    	System.out.println("file writer method is called");
//
//    	
//    }
    
	public static void closeFileWriter(){
		try {
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
