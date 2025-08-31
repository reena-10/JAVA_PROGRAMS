package placeFinder;

import java.util.*;

public class PlaceFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of devices
        int N = Integer.parseInt(scanner.nextLine());
        
        // Map to store device connections
        Map<Integer, List<Connection>> deviceConnections = new HashMap<>();
        
        // Read device information
        String[] deviceInfo = scanner.nextLine().split(" ");
        for (String info : deviceInfo) {
            String[] parts = info.split(":");
            int deviceId = Integer.parseInt(parts[0]);
            int count = Integer.parseInt(parts[1]);
            deviceConnections.put(deviceId, new ArrayList<>());
            
            // Read connections for this device
            for (int j = 0; j < count; j++) {
                int foundDeviceId = Integer.parseInt(scanner.nextLine());
                String[] connectionInfo = scanner.nextLine().split(" ");
                int distance = Integer.parseInt(connectionInfo[1]);
                int angle = Integer.parseInt(connectionInfo[2]);
                deviceConnections.get(deviceId).add(new Connection(foundDeviceId, distance, angle));
            }
        }
        
        // Read the two devices to find the distance between
        String[] lastLine = scanner.nextLine().split(" ");
        int deviceA = Integer.parseInt(lastLine[0]);
        int deviceB = Integer.parseInt(lastLine[1]);
        
        // Calculate positions of all devices
        Map<Integer, double[]> positions = new HashMap<>();
        calculatePositions(positions, deviceConnections, deviceA, 0, 0, 0);
        calculatePositions(positions, deviceConnections, deviceB, 0, 0, 0);
        
        // Calculate the distance between deviceA and deviceB
        double distance = calculateDistance(positions.get(deviceA), positions.get(deviceB));
        
        // Output the distance rounded to two decimal points
        System.out.printf("%.2f\n", distance);
        
        scanner.close();
    }
    
    private static void calculatePositions(Map<Integer, double[]> positions, Map<Integer, List<Connection>> deviceConnections, 
                                           int deviceId, double x, double y, double angle) {
        if (positions.containsKey(deviceId)) {
            return; // Already calculated
        }
        
        positions.put(deviceId, new double[]{x, y}); // Store position
        
        // Get connections for the current device
        if (deviceConnections.containsKey(deviceId)) {
            for (Connection conn : deviceConnections.get(deviceId)) {
                double distance = conn.distance;
                double newAngle = Math.toRadians(conn.angle); // Convert angle to radians
                double newX = x + distance * Math.cos(newAngle);
                double newY = y + distance * Math.sin(newAngle);
                calculatePositions(positions, deviceConnections, conn.deviceId, newX, newY, conn.angle);
            }
        }
    }
    
    private static double calculateDistance(double[] posA, double[] posB) {
        return Math.sqrt(Math.pow(posB[0] - posA[0], 2) + Math.pow(posB[1] - posA[1], 2));
    }
    
    static class Connection {
        int deviceId;
        int distance;
        int angle;
        
        Connection(int deviceId, int distance, int angle) {
            this.deviceId = deviceId;
            this.distance = distance;
            this.angle = angle;
        }
    }
}