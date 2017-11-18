import java.util.HashMap;
import java.util.Map;

public class RuleSet {
    private Map<CellState, Map<Integer, CellState>> rules = new HashMap<>();

    public RuleSet() {
        Map<Integer, CellState> aliveRules = new HashMap<>();
        Map<Integer, CellState> deadRules = new HashMap<>();

        aliveRules.put(0, CellState.DEAD);
        aliveRules.put(1, CellState.DEAD);
        aliveRules.put(2, CellState.ALIVE);
        aliveRules.put(3, CellState.ALIVE);
        aliveRules.put(4, CellState.DEAD);
        aliveRules.put(5, CellState.DEAD);
        aliveRules.put(6, CellState.DEAD);
        aliveRules.put(7, CellState.DEAD);
        aliveRules.put(8, CellState.DEAD);
        aliveRules.put(9, CellState.DEAD);

        deadRules.put(0, CellState.DEAD);
        deadRules.put(1, CellState.DEAD);
        deadRules.put(2, CellState.DEAD);
        deadRules.put(3, CellState.ALIVE);
        deadRules.put(4, CellState.DEAD);
        deadRules.put(5, CellState.DEAD);
        deadRules.put(6, CellState.DEAD);
        deadRules.put(7, CellState.DEAD);
        deadRules.put(8, CellState.DEAD);
        deadRules.put(9, CellState.DEAD);

        rules.put(CellState.ALIVE, aliveRules);
        rules.put(CellState.DEAD, deadRules);
    }

    public Map<CellState, Map<Integer, CellState>> getRules() {
        return rules;
    }
}
