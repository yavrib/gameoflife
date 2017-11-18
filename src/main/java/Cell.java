import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Cell {
    private CellState state;
    private Map<CellDirection, Cell> neighbours = new HashMap<>();

    public Cell(CellState state) {
        this.state = state;
    }

    public Map getNeighbours() {
        return neighbours;
    }

    public CellState nextState() {
        RuleSet ruleSet = new RuleSet();
        Map<CellState, Map<Integer, CellState>> rules = ruleSet.getRules();

        Integer aliveNeighbourCount = neighbours.values()
                .stream()
                .filter(neighbour -> CellState.ALIVE.equals(neighbour.getState()))
                .collect(Collectors.toList())
                .size();

        return rules.get(getState()).get(aliveNeighbourCount);
    }

    public CellState getState() {
        return state;
    }
}
