package com.YourCampus.App_Automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmulatorManager {

    private static String EMULATOR_PATH = ""; // Update this path
    private static String AVD_NAME = ""; // Update this to your AVD name
    
    public static void setEmuPath(String path) {
    	
    	EMULATOR_PATH = path;
    }
    
    public static void setAvdName(String name) {
    	
    	AVD_NAME = name;
    }

    /**
     * Starts the AVD emulator.
     */
    public static void startEmulator() throws IOException, InterruptedException {
        // Build the command to start the emulator
        ProcessBuilder processBuilder = new ProcessBuilder(EMULATOR_PATH, "-avd", AVD_NAME);
        processBuilder.redirectErrorStream(true);

        // Start the emulator
        Process process = processBuilder.start();
        System.out.println("Emulator started ..........");
        
        // Optional: Read the emulator's output
        new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        
        // Wait for the emulator to fully start (this might need adjustment based on your setup)
        Thread.sleep(10000); // Wait 20 seconds or adjust as needed
    }

    /**
     * Stops the AVD emulator.
     */
    public static void stopEmulator() throws IOException, InterruptedException {
        // Use adb to list running emulator instances
        ProcessBuilder processBuilder = new ProcessBuilder("adb", "devices");
        Process process = processBuilder.start();
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("emulator")) {
                    String[] parts = line.split("\t");
                    String emulatorId = parts[0];
                    
                    // Use adb to stop the emulator by ID
                    Process stopProcess = new ProcessBuilder("adb", "-s", emulatorId, "emu", "kill").start();
                    stopProcess.waitFor();
                    
                    System.out.println("Emulator " + emulatorId + " stopped successfully .");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
