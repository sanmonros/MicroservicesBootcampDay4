package com.nttdata.programacion_funcional_carrito;

public enum Tax {

	SUPERREDUCED(4), REDUCED(10), NORMAL(21);
    public int percent;
    private Tax(int percent) {
        this.percent = percent;
    }
    public int getPercent() {
        return percent;
    }

}
