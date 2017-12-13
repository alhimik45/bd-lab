package bd;

import javafx.beans.property.SimpleBooleanProperty;

class CheckItem<T> {
    T o;
    SimpleBooleanProperty checked;

    CheckItem(T o, boolean checked) {
        this.o = o;
        this.checked = new SimpleBooleanProperty(checked);
    }

    @Override
    public String toString() {
        return o.toString();
    }
}