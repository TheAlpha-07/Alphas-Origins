/*package com.thealpha07.alphasorigins.origin;

import com.mojang.blaze3d.systems.RenderSystem;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.origins.Origins;
import io.github.apace100.origins.badge.Badge;
import io.github.apace100.origins.badge.BadgeManager;
import io.github.apace100.origins.mixin.DrawContextAccessor;
import com.thealpha07.alphasorigins.origin.Impact;
import io.github.apace100.origins.origin.Origin;
import io.github.apace100.origins.origin.OriginLayer;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.HoveredTooltipPositioner;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Language;

import java.util.LinkedList;
import java.util.List;



public class MoreImpacts {
    private void renderOriginImpact(DrawContext context, int mouseX, int mouseY) {
        Impact impact = getCurrentOrigin().getImpact();
        int impactValue = impact.getImpactValue();
        int wOffset = impactValue * 8;
        for (int i = 0; i < 3; i++) {
            if (i < impactValue) {
                context.drawTexture(WINDOW, guiLeft + 128 + i * 10, guiTop + 19, windowWidth + wOffset, 16, 8, 8);
            } else {
                context.drawTexture(WINDOW, guiLeft + 128 + i * 10, guiTop + 19, windowWidth, 16, 8, 8);
            }
        }
        if (mouseX >= guiLeft + 128 && mouseX <= guiLeft + 158
                && mouseY >= guiTop + 19 && mouseY <= guiTop + 27) {
            MutableText ttc = Text.translatable(Origins.MODID + ".gui.impact.impact").append(": ").append(impact.getTextComponent());
            context.drawTooltip(this.textRenderer, ttc, mouseX, mouseY);
        }
    }
    public Origin getCurrentOrigin() {
        return origin;
    }
    private Origin origin;
}*/


