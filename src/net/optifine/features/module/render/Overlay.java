package net.optifine.features.module.render;

import net.optifine.config.ColorPickerSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.GeneralSettings.ColorMode;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.class_2338;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3965;
import net.minecraft.class_4493;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

public final class Overlay extends Module implements RenderListener {
   // $FF: synthetic field
   NumberSetting Jacob;
   // $FF: synthetic field
   private final EnumSetting<ColorMode> Charlie;
   // $FF: synthetic field
   public static final ColorMode[] Jack = ColorMode.values();
   // $FF: synthetic field
   ColorPickerSetting Harry;

   public String Oliver() {
      String var1 = this.Jacob.William();
      "".length();
      return "   ".length() <= 0 ? null : var1;
   }

   public void Oliver(float partialTicks) {
      if (mc.field_1765 != null && mc.field_1765.method_17783() == class_240.field_1332) {
         class_3965 blockHitResult = (class_3965)mc.field_1765;
         class_2338 pos = new class_2338(blockHitResult.method_17777());
         if (!mc.field_1761.method_2923()) {
            "".length();
            if (null != null) {
               return;
            }
         } else {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(2848);
            RenderUtils.setLineWidth(2.0F);
            GL11.glDisable(3553);
            class_4493.method_22076();
            GL11.glDisable(2929);
            GL11.glDisable(2896);
            GL11.glPushMatrix();
            RenderUtils.applyRenderOffset();
            GL11.glTranslated((double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260());
            float progress = IMC.getInteractionManager().getCurrentBreakingProgress();
            if (this.Charlie.Harry() == ColorMode.THEME) {
               ThemeManager.usePrimaryColor(progress * (this.Jacob.George() / 100.0F));
               "".length();
               if ("".length() < 0) {
                  return;
               }
            } else {
               ThemeManager.useColor(this.Harry.Oscar(), progress * (this.Jacob.George() / 100.0F));
            }

            RenderUtils.drawSolidBox();
            GL11.glPopMatrix();
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
            GL11.glDisable(2848);
            "".length();
            if ("".length() > 0) {
               return;
            }
         }
      } else {
         "".length();
         if ("  ".length() != "  ".length()) {
            return;
         }
      }

   }

   public void Charlie() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public Overlay() {
      super("Overlay", "Renders a block break animation.", Category.Harry);
      this.Charlie = new EnumSetting("Background Color Mode", Jack, ColorMode.THEME);
      this.Harry = new ColorPickerSetting("Color", 0.0F, 0.0F, 100.0F);
      this.Jacob = new NumberSetting("Max Opacity", 0.5D, 0.0D, 1.0D, 0.009999999776482582D, ValueDisplay.Harry);
      this.addSetting(this.Charlie);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if ("  ".length() == 0) {
         throw null;
      }
   }

   static {
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }
}
