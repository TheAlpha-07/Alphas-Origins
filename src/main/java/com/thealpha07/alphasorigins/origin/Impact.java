/*
package com.thealpha07.alphasorigins.origin;

import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public enum Impact {

    MYSTERIOUS(4, "mysterious", Formatting.DARK_PURPLE),
    ALPHA(5, "alpha", Formatting.BLACK);

    private int impactValue;
    private String translationKey;
    private Formatting textStyle;

    private Impact (int impactValue, String translationKey, Formatting textStyle) {
        this.translationKey = "origins.gui.impact." + translationKey;
        this.impactValue = impactValue;
        this.textStyle = textStyle;
    }

    public int getImpactValue() {
        return impactValue;
    }

    public String getTranslationKey() {
        return translationKey;
    }

    public Formatting getTextStyle() {
        return textStyle;
    }

    public MutableText getTextComponent() {
        return Text.translatable(getTranslationKey()).formatted(getTextStyle());
    }

    public static Impact getByValue(int impactValue) {
        return Impact.values()[impactValue];
    }
}*/
