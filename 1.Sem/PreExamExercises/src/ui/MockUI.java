package ui;

import java.util.ArrayList;
import java.util.List;

public class MockUI implements UI {
    private String[] inputs;
    private int inputsIndex = 0;

    private List<String> outputs = new ArrayList<>();

    public MockUI(String[] inputs) {
        this.inputs = inputs;
    }

    @Override
    public String getUserInput() {
        return inputs[inputsIndex++];
    }

    @Override
    public void println(String output) {
        outputs.add(output);
    }

    public int getOutputsSize() {
        return outputs.size();
    }

    public List<String> getOutputs() { return outputs; }
}
