package net.optifine.features.module.hud;

import com.sun.javafx.geom.CubicCurve2D;
import net.optifine.Global;
import net.optifine.config.DoubleSliderSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.mixinterface.IKeyBinding;
import net.optifine.util.font.TTFFontRenderer;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.minecraft.class_304;
import net.minecraft.class_4587;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.awt.*;

public class KeyStrokes extends Module implements Render2DListener {
   // $FF: synthetic field
   public static final NumberSetting Jacob;
   // $FF: synthetic field
   private double George = -1.5D;
   // $FF: synthetic field
   long Jack;
   // $FF: synthetic field
   private double William = -1.5D;
   // $FF: synthetic field
   private double James = -1.5D;
   // $FF: synthetic field
   public static final DoubleSliderSetting Harry = new DoubleSliderSetting("Position", 0.01D, 0.02D);
   // $FF: synthetic field
   private double Mary = -1.5D;
   // $FF: synthetic field
   private double Thomas = -1.5D;
   // $FF: synthetic field
   private double Oscar = -1.5D;
   // $FF: synthetic field
   private final CubicCurve2D Charlie = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);

   public void Thomas() {
      double var10001 = this.Thomas;
      double var10002;
      if (this.Oliver(mc.field_1690.field_1894)) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ("  ".length() != "  ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Thomas = var10001 + var10002;
      this.Thomas = MathUtils.clamp(-1.5D, this.Thomas, 1.5D);
      var10001 = this.George;
      if (this.Oliver(mc.field_1690.field_1913)) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ((11 ^ 15) == 0) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.George = var10001 + var10002;
      this.George = MathUtils.clamp(-1.5D, this.George, 1.5D);
      var10001 = this.James;
      if (this.Oliver(mc.field_1690.field_1849)) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ("".length() == -" ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.James = var10001 + var10002;
      this.James = MathUtils.clamp(-1.5D, this.James, 1.5D);
      var10001 = this.Oscar;
      if (this.Oliver(mc.field_1690.field_1881)) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ("  ".length() < 0) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Oscar = var10001 + var10002;
      this.Oscar = MathUtils.clamp(-1.5D, this.Oscar, 1.5D);
      boolean var10000;
      if (Global.Jack().A.isEnabled()) {
         if (lllllllI(System.currentTimeMillis(), this.Jack) < 0) {
            var10000 = true;
            "".length();
            if ((48 ^ 4 ^ 69 ^ 117) < 0) {
               return;
            }
         } else {
            var10000 = false;
            "".length();
            if ("  ".length() < "".length()) {
               return;
            }
         }
      } else {
         var10000 = mc.field_1729.method_1609();
      }

      boolean isClicked = var10000;
      var10001 = this.Mary;
      if (isClicked) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Mary = var10001 + var10002;
      this.Mary = MathUtils.clamp(-1.5D, this.Mary, 1.5D);
      var10001 = this.William;
      if (mc.field_1729.method_1608()) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.William = var10001 + var10002;
      this.William = MathUtils.clamp(-1.5D, this.William, 1.5D);
      "".length();
      if ("".length() > -" ".length()) {
         ;
      }
   }

   public KeyStrokes() {
      super("KeyStrokes");
      this.Oliver(Category.Thomas);
      this.addSetting(Harry);
      this.addSetting(Jacob);
      "".length();
      if ((89 ^ 93) < 0) {
         throw null;
      }
   }

   static {
      Jacob = new NumberSetting("Rounding Radius", 0.2D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Oliver(long until) {
      this.Jack = until;
      "".length();
      if ((44 ^ 40) > 0) {
         ;
      }
   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      this.Thomas();
      TTFFontRenderer font = Global.Harry.getGeneric();
      int space = 3;
      float size = font.getHeight("WASDRMBLBM") + 11.0F;
      byte var10000;
      if (Global.Jack().F.isEnabled() && Global.Jack().F.Jack.Jack()) {
         var10000 = 1;
         "".length();
         if ((7 ^ 2) <= 0) {
            return;
         }
      } else {
         var10000 = 0;
      }

      int hasReachDisplay = var10000;
      double x = (double)((float)mc.method_22683().method_4486() - size * 3.0F - (float)(space * 2)) * Harry.Oscar();
      double y = (double)((float)mc.method_22683().method_4502() - size * (float)(3 + hasReachDisplay) - (float)(space * (2 + hasReachDisplay))) * Harry.James();
      double x0 = x + (double)size + (double)space;
      double x1 = x + (double)(size * 2.0F) + (double)space;
      double y1 = y + (double)size;
      int pressedARange = (int)(this.Charlie.eval((float)(this.George / 3.0D + 0.5D)).y * 231.0F);
      int pressedWRange = (int)(this.Charlie.eval((float)(this.Thomas / 3.0D + 0.5D)).y * 231.0F);
      int pressedSRange = (int)(this.Charlie.eval((float)(this.Oscar / 3.0D + 0.5D)).y * 231.0F);
      int pressedDRange = (int)(this.Charlie.eval((float)(this.James / 3.0D + 0.5D)).y * 231.0F);
      int pressedLBMRange = (int)Math.min(this.Charlie.eval((float)(this.William / 3.0D + 0.5D)).y * 231.0F, 231.0F);
      int pressedRMBRange = (int)Math.min(this.Charlie.eval((float)(this.Mary / 3.0D + 0.5D)).y * 231.0F, 231.0F);
      Color wColor = new Color(24 + pressedWRange, 24 + pressedWRange, 24 + pressedWRange, 100);
      Color sColor = new Color(24 + pressedSRange, 24 + pressedSRange, 24 + pressedSRange, 100);
      Color aColor = new Color(24 + pressedARange, 24 + pressedARange, 24 + pressedARange, 100);
      Color dColor = new Color(24 + pressedDRange, 24 + pressedDRange, 24 + pressedDRange, 100);
      Color lbmColor = new Color(24 + pressedLBMRange, 24 + pressedLBMRange, 24 + pressedLBMRange, 100);
      Color rmbColor = new Color(24 + pressedRMBRange, 24 + pressedRMBRange, 24 + pressedRMBRange, 100);
      RenderUtils.drawRoundedRectWithShadow(x0, y, x1, y1, Jacob.Jack() * (double)size / 2.0D, wColor.getRGB(), 0.0D, 0.0D, 5.0D, (new Color(wColor.getRed(), wColor.getGreen(), wColor.getBlue(), 63)).getRGB());
      font.drawCenteredStringWithShadow("W", (double)((float)(x0 + x1) / 2.0F), (double)((float)(y + y1) / 2.0F), -1);
      double y0 = y + (double)size + (double)space;
      x1 = x + (double)size;
      y1 = y + (double)(size * 2.0F) + (double)space;
      RenderUtils.drawRoundedRectWithShadow(x, y0, x1, y1, Jacob.Jack() * (double)size / 2.0D, aColor.getRGB(), 0.0D, 0.0D, 5.0D, (new Color(aColor.getRed(), aColor.getGreen(), aColor.getBlue(), 63)).getRGB());
      font.drawCenteredStringWithShadow("A", (double)((float)(x + x1) / 2.0F), (double)((float)(y0 + y1) / 2.0F), -1);
      x0 = x + (double)size + (double)space;
      y0 = y + (double)size + (double)space;
      x1 = x + (double)(size * 2.0F) + (double)space;
      y1 = y + (double)(size * 2.0F) + (double)space;
      RenderUtils.drawRoundedRectWithShadow(x0, y0, x1, y1, Jacob.Jack() * (double)size / 2.0D, sColor.getRGB(), 0.0D, 0.0D, 5.0D, (new Color(sColor.getRed(), sColor.getGreen(), sColor.getBlue(), 63)).getRGB());
      font.drawCenteredStringWithShadow("S", (double)((float)(x0 + x1) / 2.0F), (double)((float)(y0 + y1) / 2.0F), -1);
      x0 = x + (double)(size * 2.0F) + (double)(space * 2);
      y0 = y + (double)size + (double)space;
      x1 = x + (double)(size * 3.0F) + (double)(space * 2);
      y1 = y + (double)(size * 2.0F) + (double)space;
      RenderUtils.drawRoundedRectWithShadow(x0, y0, x1, y1, Jacob.Jack() * (double)size / 2.0D, dColor.getRGB(), 0.0D, 0.0D, 5.0D, (new Color(dColor.getRed(), dColor.getGreen(), dColor.getBlue(), 63)).getRGB());
      font.drawCenteredStringWithShadow("D", (double)((float)(x0 + x1) / 2.0F), (double)((float)(y0 + y1) / 2.0F), -1);
      x0 = x + (double)size * 1.5D + (double)space * 1.5D;
      y0 = y + (double)(size * 2.0F) + (double)(space * 2);
      x1 = x + (double)(size * 3.0F) + (double)(space * 2);
      y1 = y + (double)(size * 3.0F) + (double)(space * 2);
      RenderUtils.drawRoundedRectWithShadow(x0, y0, x1, y1, Jacob.Jack() * (double)size / 2.0D, rmbColor.getRGB(), 0.0D, 0.0D, 5.0D, (new Color(rmbColor.getRed(), rmbColor.getGreen(), rmbColor.getBlue(), 63)).getRGB());
      font.drawCenteredStringWithShadow("RMB", (double)((float)(x0 + x1) / 2.0F), (double)((float)(y0 + y1) / 2.0F), -1);
      y0 = y + (double)(size * 2.0F) + (double)(space * 2);
      x1 = x + (double)size * 1.5D + (double)space * 0.5D;
      y1 = y + (double)(size * 3.0F) + (double)(space * 2);
      RenderUtils.drawRoundedRectWithShadow(x, y0, x1, y1, Jacob.Jack() * (double)size / 2.0D, lbmColor.getRGB(), 0.0D, 0.0D, 5.0D, (new Color(lbmColor.getRed(), lbmColor.getGreen(), lbmColor.getBlue(), 63)).getRGB());
      font.drawCenteredStringWithShadow("LMB", (double)((float)(x + x1) / 2.0F), (double)((float)(y0 + y1) / 2.0F), -1);
      "".length();
      if (" ".length() != "   ".length()) {
         ;
      }
   }

   private static int lllllllI(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private boolean Oliver(class_304 kb) {
      IKeyBinding key = (IKeyBinding)kb;
      byte var3 = key.isActallyPressed();
      "".length();
      return (boolean)(" ".length() >= "  ".length() ? "".length() : var3);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      "".length();
      if ((138 ^ 142) <= (30 ^ 26)) {
         ;
      }
   }
}
