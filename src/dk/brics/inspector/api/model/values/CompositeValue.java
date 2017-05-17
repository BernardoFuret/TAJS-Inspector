package dk.brics.inspector.api.model.values;

import java.util.Set;

public class CompositeValue {

    public final Set<SingleValue> values;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositeValue that = (CompositeValue) o;

        return values != null ? values.equals(that.values) : that.values == null;
    }

    @Override
    public int hashCode() {
        return values != null ? values.hashCode() : 0;
    }

    public CompositeValue(Set<SingleValue> values) {
        this.values = values;
    }
}
