package net.optifine.features.module.hud;

import net.optifine.config.BooleanSetting;
import net.optifine.config.DoubleSliderSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.util.render.RenderUtils;
import net.minecraft.class_266;
import net.minecraft.class_4587;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class Scoreboard extends Module implements Render2DListener {
   // $FF: synthetic field
   public static BooleanSetting George = new BooleanSetting("Replace with shaders", true);
   // $FF: synthetic field
   public static NumberSetting Mary;
   // $FF: synthetic field
   public static BooleanSetting Oscar = new BooleanSetting("Border Rect", true);
   // $FF: synthetic field
   public static DoubleSliderSetting Jacob = new DoubleSliderSetting("Scoreboard Offset", 1.0D, 0.5D, false);
   // $FF: synthetic field
   public static BooleanSetting Thomas = new BooleanSetting("Client Font", false);
   // $FF: synthetic field
   public static class_266 Jack;
   // $FF: synthetic field
   public static NumberSetting James;
   // $FF: synthetic field
   public static NumberSetting William;
   // $FF: synthetic field
   public static BooleanSetting Charlie = new BooleanSetting("Hide Player Score", true);
   // $FF: synthetic field
   public static BooleanSetting Harry = new BooleanSetting("Show Scoreboard", true);

   protected void Jacob() {
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      "".length();
      if ("".length() > -" ".length()) {
         ;
      }
   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      if (Jack != null && Harry.Jack()) {
         RenderUtils.renderScoreboard(matrixStack, Jack);
      }

      "".length();
      if (-" ".length() < "".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      "".length();
      if ("".length() <= "   ".length()) {
         ;
      }
   }

   public Scoreboard() {
      super("Scoreboard", "Modifies minecraft's scoreboard", Category.Thomas);
      this.addSetting(Harry);
      this.addSetting(Jacob);
      this.addSetting(Charlie);
      this.addSetting(George);
      this.addSetting(James);
      this.addSetting(William);
      this.addSetting(Mary);
      this.addSetting(Oscar);
      "".length();
      if ("   ".length() <= -" ".length()) {
         throw null;
      }
   }

   static {
      James = new NumberSetting("Title Background Color Opacity", 0.4D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      William = new NumberSetting("Background Color Opacity", 0.3D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      Mary = new NumberSetting("Shadow Opacity", 0.3D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      "".length();
      if ((23 ^ 110 ^ 188 ^ 193) > 0) {
         ;
      }
   }
}
