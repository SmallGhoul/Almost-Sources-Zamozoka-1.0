package net.optifine.clickgui.components.settings;

import net.minecraft.class_4493;
import net.minecraft.class_4587;
import net.optifine.clickgui.ClickGui;
import net.optifine.clickgui.SettingGUI;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class ColorPickerGUI extends SettingGUI {
   // $FF: synthetic field
   private final ClickGui Jack = Global.Charlie();
   // $FF: synthetic field
   private boolean Charlie;
   // $FF: synthetic field
   private boolean Jacob;
   // $FF: synthetic field
   private final ColorPickerSetting Harry;

   private static int llIIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Jennifer() {
      double xPos = this.James();
      double yPos = this.Harry();
      double yPosition = (double)(this.Harry.Jack() * 70.0F) + yPos;
      RenderUtils.drawRoundedRect(xPos, yPosition, xPos + 5.0D + 2.0D, yPosition + 2.0D, 1.0D, 1426063360);
      int i = 0;

      do {
         if (i >= 35) {
            RenderUtils.drawRoundedRect(xPos - 1.0D, yPosition - 1.0D, xPos + 5.0D + 1.0D, yPosition + 1.0D, 1.0D, ThemeHelper.getFontColor().getRGB());
            "".length();
            if ("".length() < -" ".length()) {
               return;
            }

            return;
         }

         Color col = Color.getHSBColor((float)i / 35.0F, 1.0F, 1.0F);
         Color col2 = Color.getHSBColor((float)(i + 1) / 35.0F, 1.0F, 1.0F);
         RenderUtils.drawGradientRect(xPos, yPos + (double)(i * 2), xPos + 5.0D, yPos + (double)(i * 2) + 2.0D, col, col2);
         ++i;
         "".length();
      } while(-" ".length() < 0);

   }

   private void Harry(double mouseX, double mouseY) {
      this.Jacob = true;
      this.Charlie = this.Oliver(mouseX, mouseY);
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   private static int llIIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Jacob(double mouseX, double mouseY) {
      if (!this.Jacob) {
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else if (this.Jack.Harry() && !this.Jack.Jacob) {
         double x1;
         double x2;
         if (this.Charlie) {
            x1 = this.Oscar();
            x2 = x1 + 70.0D;
            double y1 = this.Harry();
            double y2 = y1 + 70.0D;
            if (llIIllI(mouseX, x1) < 0) {
               mouseX = x1;
            }

            if (llIIlll(mouseX, x2) > 0) {
               mouseX = x2;
            }

            if (llIIllI(mouseY, y1) < 0) {
               mouseY = y1;
            }

            if (llIIlll(mouseY, y2) > 0) {
               mouseY = y2;
            }

            mouseX -= x1;
            mouseY -= y1;
            this.Harry.Jack((float)(mouseX / 70.0D));
            this.Harry.Harry((float)(1.0D - mouseY / 70.0D));
            "".length();
            if (" ".length() < 0) {
               return;
            }
         } else {
            x1 = this.Harry();
            x2 = x1 + 70.0D;
            if (llIIllI(mouseY, x1) < 0) {
               mouseY = x1;
            }

            if (llIIlll(mouseY, x2) > 0) {
               mouseY = x2;
            }

            mouseY -= x1;
            this.Harry.Oliver((float)(mouseY / 70.0D));
         }

         "".length();
         if (-" ".length() >= "  ".length()) {
            return;
         }
      } else {
         this.Jacob = false;
         "".length();
         if ("  ".length() != "  ".length()) {
            return;
         }
      }

   }

   public double George() {
      double var1 = 70.0D;
      "".length();
      return -"   ".length() > 0 ? 0.0D : var1;
   }

   private void Mary() {
      float h = this.Harry.Jack();
      double xPos = this.Oscar();
      double yPos = this.Harry();
      int x = 0;

      do {
         if (llIlIII((float)x, 8.0F) >= 0) {
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }

            return;
         }

         int y = 0;

         while(llIlIII((float)y, 8.0F) < 0) {
            GL11.glDisable(3553);
            class_4493.method_22078();
            GL11.glEnable(3042);
            GL11.glBegin(7);
            Color col = Color.getHSBColor(h, (float)x / 8.0F, 1.0F - (float)y / 8.0F);
            GL11.glColor3f((float)col.getRed() / 255.0F, (float)col.getGreen() / 255.0F, (float)col.getBlue() / 255.0F);
            GL11.glVertex2d(xPos + (double)((float)x / 8.0F * 70.0F), yPos + (double)((float)y / 8.0F * 70.0F));
            col = Color.getHSBColor(h, (float)(x + 1) / 8.0F, 1.0F - (float)y / 8.0F);
            GL11.glColor3f((float)col.getRed() / 255.0F, (float)col.getGreen() / 255.0F, (float)col.getBlue() / 255.0F);
            GL11.glVertex2d(xPos + (double)((float)(x + 1) / 8.0F * 70.0F), yPos + (double)((float)y / 8.0F * 70.0F));
            col = Color.getHSBColor(h, (float)(x + 1) / 8.0F, 1.0F - (float)(y + 1) / 8.0F);
            GL11.glColor3f((float)col.getRed() / 255.0F, (float)col.getGreen() / 255.0F, (float)col.getBlue() / 255.0F);
            GL11.glVertex2d(xPos + (double)((float)(x + 1) / 8.0F * 70.0F), yPos + (double)((float)(y + 1) / 8.0F * 70.0F));
            col = Color.getHSBColor(h, (float)x / 8.0F, 1.0F - (float)(y + 1) / 8.0F);
            GL11.glColor3f((float)col.getRed() / 255.0F, (float)col.getGreen() / 255.0F, (float)col.getBlue() / 255.0F);
            GL11.glVertex2d(xPos + (double)((float)x / 8.0F * 70.0F), yPos + (double)((float)(y + 1) / 8.0F * 70.0F));
            GL11.glEnd();
            ++y;
            "".length();
            if (null != null) {
               return;
            }
         }

         ++x;
         "".length();
      } while((23 ^ 75 ^ 43 ^ 115) != -" ".length());

   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int llIIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private double James() {
      double var1 = this.Oscar() - 6.0D - 5.0D;
      "".length();
      return (133 ^ 128) == 0 ? 0.0D : var1;
   }

   private void Patricia() {
      double xPosition = this.Oscar() + (double)(this.Harry.Harry() * 70.0F);
      double yPosition = this.Harry() + (double)((1.0F - this.Harry.George()) * 70.0F);
      Color co = ThemeHelper.getColor();
      RenderUtils.drawCircle(xPosition, yPosition, 3.0D, new Color(co.getRed(), co.getGreen(), co.getBlue(), 170));
      RenderUtils.drawCircle(xPosition, yPosition, 2.0D, Color.getHSBColor(this.Harry.Jack(), this.Harry.Harry(), this.Harry.George()));
      "".length();
      if ("  ".length() >= "".length()) {
         ;
      }
   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      this.Jacob(mouseX, mouseY);
      Global.Harry.getGeneric().drawStringWithShadow(this.Harry.Susan(), this.Jack() + 5.0D, this.Harry(), ThemeHelper.getFontColor().getRGB());
      this.Oliver(mouseX, mouseY);
      "".length();
      this.Jack(mouseX, mouseY);
      "".length();
      this.Mary();
      this.Patricia();
      this.Jennifer();
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      if (!this.Oliver(mouseX, mouseY) && !this.Jack(mouseX, mouseY)) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         switch(mouseButton) {
         case 0:
            this.Harry(mouseX, mouseY);
            "".length();
            if ("   ".length() == "  ".length()) {
               return;
            }
            break;
         case 1:
            this.William();
         }

         "".length();
         if (-" ".length() > 0) {
            return;
         }
      }

   }

   private static int llIIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private double Oscar() {
      double var1 = this.Jack() + this.Jacob() - 70.0D - 4.0D;
      "".length();
      return null != null ? 0.0D : var1;
   }

   private void William() {
      this.Harry.Oliver(0.6F);
      this.Harry.Jack(0.6F);
      this.Harry.Harry(1.0F);
      "".length();
      if (-"  ".length() < 0) {
         ;
      }
   }

   public ColorPickerGUI( ColorPickerSetting setting) {
      this.Harry = setting;
      this.Oliver = setting;
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      "".length();
      if (-" ".length() >= 0) {
         throw null;
      }
   }

   private boolean Oliver(double x, double y) {
      double x1 = this.Oscar();
      double x2 = x1 + 70.0D;
      double y1 = this.Harry();
      double y2 = y1 + 70.0D;
      byte var10000;
      if (llIIIlI(x, x1) >= 0 && llIIIll(x, x2) <= 0 && llIIIlI(y, y1) >= 0 && llIIIll(y, y2) <= 0) {
         var10000 = 1;
         "".length();
         if ((85 ^ 22 ^ 42 ^ 108) <= 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var12 = var10000;
      "".length();
      return (boolean)(-"   ".length() > 0 ? "".length() : var12);
   }

   private static int llIlIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public double Oliver() {
      double var1 = 70.0D;
      "".length();
      return -(42 ^ 46) > 0 ? 0.0D : var1;
   }

   private static int llIIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private boolean Jack(double x, double y) {
      double x1 = this.James();
      double x2 = x1 + 5.0D;
      double y1 = this.Harry();
      double y2 = y1 + this.Charlie();
      byte var10000;
      if (llIIlII(x, x1) >= 0 && llIIlIl(x, x2) <= 0 && llIIlII(y, y1) >= 0 && llIIlIl(y, y2) <= 0) {
         var10000 = 1;
         "".length();
         if (-" ".length() >= "  ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var12 = var10000;
      "".length();
      return (boolean)(null != null ? "".length() : var12);
   }
}
