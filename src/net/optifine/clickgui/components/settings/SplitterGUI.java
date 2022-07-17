package net.optifine.clickgui.components.settings;

import com.sun.javafx.geom.CubicCurve2D;
import net.minecraft.class_4587;
import net.optifine.clickgui.ClickGui;
import net.optifine.clickgui.SettingGUI;
import net.optifine.clickgui.window.AbstractWindow;

import java.awt.*;

public class SplitterGUI extends SettingGUI {
   // $FF: synthetic field
   private final ClickGui Jack = Global.Charlie();
   // $FF: synthetic field
   private double Charlie = -1.5D;
   // $FF: synthetic field
   private final Splitter Jacob;
   // $FF: synthetic field
   private final CubicCurve2D Harry = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);

   static {
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   public SplitterGUI( Splitter setting) {
      this.Jacob = setting;
      this.Oliver = setting;
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      "".length();
      if (null != null) {
         throw null;
      }
   }

   public double Oliver() {
      double var1 = (double)(Global.Harry.getGeneric().getWidth(this.Jacob.Susan()) + 13.0F);
      "".length();
      return (161 ^ 165) <= "".length() ? 0.0D : var1;
   }

   private void Oliver(double x1, double y1) {
      Global.Harry.getGeneric().drawCenteredStringWithShadow(this.Jacob.Susan(), (double)((float)(x1 + this.Jacob() / 2.0D - 5.0D)), (double)((float)y1 + 5.0F), ThemeHelper.getHeaderTextColor().getRGB());
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private void Oliver(double x1, double x3, double y1, double y2, boolean hovering) {
      Color bg = new Color(ThemeHelper.getColor().getRed() + 7, ThemeHelper.getColor().getRed() + 7, ThemeHelper.getColor().getRed() + 7, 255);
      RenderUtils.drawGradientRect(x1 + 5.0D, y1 + 2.0D, x1 + this.Jacob() / 2.0D - 8.0D - (double)Global.Harry.getGeneric().getWidth(this.Jacob.Susan()) / 2.0D, y2 - 2.0D, new Color(bg.getRed(), bg.getRed(), bg.getRed(), 120), new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), 0), new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), 0), new Color(bg.getRed(), bg.getRed(), bg.getRed(), 120));
      RenderUtils.drawGradientRect(x1 + this.Jacob() / 2.0D - 3.0D + (double)Global.Harry.getGeneric().getWidth(this.Jacob.Susan()) / 2.0D, y1 + 2.0D, x1 + this.Jacob() - 5.0D, y2 - 2.0D, new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), 0), new Color(bg.getRed(), bg.getRed(), bg.getRed(), 120), new Color(bg.getRed(), bg.getRed(), bg.getRed(), 120), new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), 0));
      "".length();
      if (-(100 + 85 - 153 + 97 ^ 62 + 35 - 63 + 98) < 0) {
         ;
      }
   }

   private boolean Oliver(double mouseX, double mouseY, double x1, double x2, double y1, double y2) {
      y1 -= 3.0D;
      y2 += 3.0D;
      AbstractWindow parent = this.Thomas();
      boolean scrollEnabled = parent.Elizabeth();
      double var10000;
      if (scrollEnabled) {
         var10000 = parent.Patricia();
         "".length();
         if (-" ".length() >= "".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0.0D;
      }

      double scroll = var10000;
      byte var17;
      if (lIIIIlIllI(mouseX, x1) >= 0 && lIIIIlIllI(mouseY, y1) >= 0 && lIIIIlIlll(mouseX, x2) <= 0 && lIIIIlIlll(mouseY, y2) <= 0 && lIIIIlIllI(mouseY, -scroll) >= 0 && lIIIIlIlll(mouseY, parent.Charlie() - 25.0D - scroll) < 0) {
         var17 = 1;
         "".length();
         if ("   ".length() < "".length()) {
            return (boolean)"".length();
         }
      } else {
         var17 = 0;
      }

      byte var16 = var17;
      "".length();
      return (boolean)(null != null ? "".length() : var16);
   }

   private void Oscar() {
      String tooltip = "";
      if (this.Jacob != null) {
         tooltip = this.Jacob.Oliver();
      }

      this.Jack.Oliver(tooltip);
      "".length();
      if (-(166 + 130 - 268 + 157 ^ 75 + 158 - 59 + 15) < 0) {
         ;
      }
   }

   private static int lIIIIlIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public double George() {
      double var1 = 8.0D;
      "".length();
      return -(222 ^ 196 ^ 22 ^ 9) >= 0 ? 0.0D : var1;
   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      double x1 = this.Jack() + 5.0D;
      double x4 = this.Jack() + this.Jacob() - 18.0D;
      double x2 = x1 + this.Jacob();
      double x3 = x4 + 11.0D;
      double y1 = this.Harry();
      double y2 = y1 + this.Charlie();
      boolean var10000;
      if (this.Oliver(mouseX, mouseY, x1, x2, y1, y2) && !this.Jack.Jacob) {
         var10000 = true;
         "".length();
         if (" ".length() <= -" ".length()) {
            return;
         }
      } else {
         var10000 = false;
      }

      boolean hovering = var10000;
      double var10001 = this.Charlie;
      double var10002;
      if (hovering) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Charlie = var10001 + var10002;
      this.Charlie = MathUtils.clamp(-1.5D, this.Charlie, 1.5D);
      if (hovering && lIIIIlIlIl(mouseX, x1) >= 0) {
         this.Oscar();
      }

      this.Oliver(x1, x2, y1, y2, hovering);
      this.Oliver(x1, y1);
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   private static int lIIIIlIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIlIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }
}
