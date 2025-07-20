package dev.aerodeskpro.database;

import dev.aerodeskpro.models.Gate;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GateDAO {
    private Connection connection;
    
    public GateDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Gate> getAllGates() throws SQLException {
        List<Gate> gates = new ArrayList<>();
        String query = "SELECT g.gate_id, g.gate_number, g.terminal, g.status, " +
                       "f1.flight_id as current_flight_id, f2.flight_id as next_flight_id, " +
                       "g.is_available " +
                       "FROM gate g " +
                       "LEFT JOIN flight f1 ON g.current_flight_id = f1.flight_id " +
                       "LEFT JOIN flight f2 ON g.next_flight_id = f2.flight_id";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                Gate gate = new Gate();
                gate.setGateId(rs.getInt("gate_id"));
                gate.setGateNumber(rs.getString("gate_number"));
                gate.setTerminal(rs.getString("terminal"));
                gate.setStatus(rs.getString("status"));
                gate.setCurrentFlightId(rs.getInt("current_flight_id"));
                gate.setNextFlightId(rs.getInt("next_flight_id"));
                gate.setAvailable(rs.getBoolean("is_available"));
                
                gates.add(gate);
            }
        }
        return gates;
    }
}