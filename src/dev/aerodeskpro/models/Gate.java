package dev.aerodeskpro.models;

public class Gate {
    private int gateId;
    private String gateNumber;
    private String terminal;
    private String status;
    private int currentFlightId;
    private int nextFlightId;
    private boolean isAvailable;
    
    // Getters and Setters
    public int getGateId() { return gateId; }
    public void setGateId(int gateId) { this.gateId = gateId; }
    
    public String getGateNumber() { return gateNumber; }
    public void setGateNumber(String gateNumber) { this.gateNumber = gateNumber; }
    
    public String getTerminal() { return terminal; }
    public void setTerminal(String terminal) { this.terminal = terminal; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public int getCurrentFlightId() { return currentFlightId; }
    public void setCurrentFlightId(int currentFlightId) { this.currentFlightId = currentFlightId; }
    
    public int getNextFlightId() { return nextFlightId; }
    public void setNextFlightId(int nextFlightId) { this.nextFlightId = nextFlightId; }
    
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}