package net.optifine.features.module.hud;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.DoubleSliderSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.AttackListener;
import net.optifine.managers.event.events.PostEntityReachListener;
import net.optifine.managers.event.events.PostEntityReachListener.PostEntityReachEvent;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.render.RenderUtils;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_4587;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class ReachDisplay extends Module implements AttackListener, PostEntityReachListener, Render2DListener {
   // $FF: synthetic field
   private final DoubleSliderSetting Charlie = new DoubleSliderSetting("Position", 0.01D, 0.02D);
   // $FF: synthetic field
   double Jacob;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   String Harry;
   // $FF: synthetic field
   public final BooleanSetting Jack;
   // $FF: synthetic field
   private final NumberSetting Thomas;

   protected void Jacob() {
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      EVENT_MANAGER.Oliver(AttackListener.class, this);
      EVENT_MANAGER.Oliver(PostEntityReachListener.class, this);
      "".length();
      if ((114 ^ 126 ^ 179 ^ 186) > 0) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      EVENT_MANAGER.Jack(AttackListener.class, this);
      EVENT_MANAGER.Jack(PostEntityReachListener.class, this);
      "".length();
      if (-" ".length() != "   ".length()) {
         ;
      }
   }

   public void Oliver(PostEntityReachEvent event) {
      this.Jacob = event.Oliver;
      "".length();
      if (-(118 ^ 114) < 0) {
         ;
      }
   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      TTFFontRenderer font = Global.Harry.getGeneric();
      float height;
      float width;
      double x;
      double y;
      if (this.Jack.Jack()) {
         height = font.getHeight("WASDRMBLBM") + 11.0F;
         width = height * 3.0F + 6.0F;
         x = KeyStrokes.Harry.Oscar() * (double)((float)mc.method_22683().method_4486() - width);
         y = KeyStrokes.Harry.James() * (double)((float)mc.method_22683().method_4502() - width - height - 3.0F) + (double)width + 3.0D;
         "".length();
         if (null != null) {
            return;
         }
      } else {
         height = font.getHeight(this.Harry) + 11.0F;
         width = 100.0F;
         x = this.Charlie.Oscar() * (double)((float)mc.method_22683().method_4486() - width);
         y = this.Charlie.James() * (double)((float)mc.method_22683().method_4502() - height);
      }

      double var10002 = x + (double)width;
      double var10003 = y + (double)height;
      double var10004;
      if (this.Jack.Jack()) {
         var10004 = KeyStrokes.Jacob.Jack() * (double)height / 2.0D;
         "".length();
         if ("  ".length() < -" ".length()) {
            return;
         }
      } else {
         var10004 = (double)height * this.Thomas.Jack() / 2.0D;
      }

      RenderUtils.drawRoundedRectWithShadow(x, y, var10002, var10003, var10004, 1679300632, 0.0D, 0.0D, 5.0D, 1679300632);
      Global.Harry.getGeneric().drawCenteredStringWithShadow(this.Harry, x + (double)(width / 2.0F), y + (double)(height / 2.0F), -1);
      "".length();
      if (null == null) {
         ;
      }
   }

   public ReachDisplay() {
      super("ReachDisplay");
      this.Thomas = new NumberSetting("Rounding Radius", 0.2D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      this.George = new BooleanSetting("Scale Reach", "Scales reach so unlegit hits appear as 3.0", false);
      this.Jack = new BooleanSetting("Snap Under KeyStrokes", "Makes ReachDisplay look like the continuation of KeyStrokes.", false);
      this.Harry = "N/A";
      this.Jacob = 3.0D;
      this.Oliver(Category.Thomas);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Jack);
      "".length();
      if ((92 ^ 88) <= "   ".length()) {
         throw null;
      }
   }

   static {
      "".length();
      if ("".length() > -" ".length()) {
         ;
      }
   }

   public void Oliver(class_1657 player, class_1297 target, Double reach) {
      if (reach != null) {
         StringBuilder var10001 = new StringBuilder();
         double var10002 = reach;
         double var10003;
         if (this.George.Jack()) {
            var10003 = this.Jacob;
            "".length();
            if (-" ".length() >= 0) {
               return;
            }
         } else {
            var10003 = 3.0D;
         }

         this.Harry = String.valueOf(var10001.append((double)Math.round(var10002 / var10003 * 3000.0D) / 1000.0D).append(" blocks."));
         "".length();
         if (null != null) {
            return;
         }
      } else {
         this.Harry = "HitBox Missed.";
      }

      "".length();
      if ("   ".length() >= "   ".length()) {
         ;
      }
   }
}
