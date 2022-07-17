package net.optifine.clickgui.components.settings;

import net.minecraft.class_4587;
import net.optifine.clickgui.EnumSettingMiniMenu;
import net.optifine.clickgui.MiniMenu;
import net.optifine.clickgui.SettingGUI;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public final class EnumSettingGUI<T extends Enum<T>> extends SettingGUI {
   // $FF: synthetic field
   private EnumSettingMiniMenu<T> Charlie;
   // $FF: synthetic field
   private float Jack;
   // $FF: synthetic field
   private ListSetting Harry;
   // $FF: synthetic field
   private EnumSetting<T> Jacob;

   private static int lIIIIllIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public double George() {
      double var1 = 11.0D;
      "".length();
      return "  ".length() < "".length() ? 0.0D : var1;
   }

   private void James() {
      if (this.Mary()) {
         this.Charlie.James();
         "".length();
         if ((74 ^ 116 ^ 115 ^ 73) <= -" ".length()) {
            return;
         }
      } else if (Global.Thomas.Jack.Harry) {
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else {
         if (this.Charlie != null && lIIIIlllII(this.Charlie.Oliver, 0.0D) <= 0) {
            this.Charlie = null;
         }

         this.Charlie = new EnumSettingMiniMenu(this, this.Jacob);
         Global.Charlie().Oliver(( MiniMenu )this.Charlie);
         "".length();
         if (null != null) {
            return;
         }
      }

   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      if (lIIIIllIlI(mouseX, this.Jack() + 5.0D) >= 0 && lIIIIllIll(mouseX, this.Jack() + this.Jacob() - 5.0D) <= 0) {
         switch(mouseButton) {
         case 0:
            this.James();
            "".length();
            if (-(125 + 4 - 50 + 52 ^ 44 + 86 - 103 + 107) >= 0) {
               return;
            }
            break;
         case 1:
            this.William();
         }

         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      }

   }

   private static int lIIIIlllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public double Oliver() {
      double var1 = (double)(Global.Harry.getGeneric().getWidth(this.Jacob.Susan()) + this.Jack);
      "".length();
      return "  ".length() <= 0 ? 0.0D : var1;
   }

   private float Oscar() {
      float w = 0.0F;
      Enum[] var2 = this.Jacob.Jack();
      int var3 = var2.length;
      int var4 = 0;

      do {
         if (var4 >= var3) {
            float var6 = w + 7.0F;
            "".length();
            if (" ".length() <= 0) {
               return 0.0F;
            }

            return var6;
         }

         Enum<T> v = var2[var4];
         w = Math.max(w, Global.Harry.getSmallMain().getWidth(v.toString()));
         ++var4;
         "".length();
      } while(-"  ".length() <= 0);

      return 0.0F;
   }

   private static int lIIIIllIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIlllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if ("  ".length() >= "  ".length()) {
         ;
      }
   }

   private void William() {
      if (!this.Mary() && !Global.Thomas.Jack.Harry) {
         if (this.Jacob != null) {
            T defaultSelected = this.Jacob.George();
            this.Jacob.Oliver(defaultSelected);
            "".length();
            if ("".length() < 0) {
               return;
            }
         } else {
            this.Harry.Oliver(this.Harry.Harry());
         }

         "".length();
         if ("  ".length() <= "".length()) {
            return;
         }
      } else {
         "".length();
         if ("".length() != 0) {
            return;
         }
      }

   }

   public void Oliver(class_4587 matrixStack, double mouseX, double mouseY, float partialTicks) {
      this.Jack = this.Oscar();
      double x2 = this.Jack() + this.Jacob() - 5.0D;
      double x1 = x2 - (double)this.Jack;
      RenderUtils.drawRoundedRect(x1 + 1.0D, this.Harry() + 1.0D, x2 + 1.0D, this.Harry() + this.Charlie() + 1.0D, 2.0D, ThemeHelper.getColor().getRGB());
      RenderUtils.drawRoundedRect(x1, this.Harry(), x2, this.Harry() + this.Charlie(), 2.0D, ThemeHelper.getColor2().getRGB());
      String val = this.Jacob.Harry().toString();
      if (Global.Thomas.Jack.Harry) {
         val = this.Jacob.Jack()[(int)((double)this.Jacob.Jack().length * ((this.Harry() * 42781.0D + (double)(System.currentTimeMillis() * 3L)) % 5000.0D * 3.0D / 15000.0D))].toString();
      }

      float h = Global.Harry.getSmallMain().getHeight(val);
      Global.Harry.getSmallMain().drawString(val, x1, this.Harry() + (double)((11.0F - h) / 2.0F), ThemeHelper.getFontColor().getRGB());
      "".length();
      Global.Harry.getGeneric().drawStringWithShadow(this.Jacob.Susan(), this.Jack() + 5.0D, this.Harry(), ThemeHelper.getFontColor().getRGB());
      GL11.glLineWidth(2.0F);
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glEnable(3042);
      Color theme = ThemeManager.getPrimaryColor(this.Harry() * 3.0D);
      Color gray = ThemeHelper.getHoveredColor();
      Color themeT = new Color(theme.getRed(), theme.getGreen(), theme.getBlue(), 60);
      --x2;
      double y1 = this.Harry();
      double y2 = this.Harry() + this.Charlie();
      if (Global.Thomas.Jack.Harry) {
         GL11.glColor4f((float)gray.getRed() / 255.0F, (float)gray.getGreen() / 255.0F, (float)gray.getBlue() / 255.0F, 1.0F);
         "".length();
         if ("".length() >= (29 ^ 25)) {
            return;
         }
      } else {
         GL11.glColor4f((float)theme.getRed() / 255.0F, (float)theme.getGreen() / 255.0F, (float)theme.getBlue() / 255.0F, 1.0F);
         RenderUtils.drawRoundedRectWithShadow(x2 - 4.0D, y1 + 5.0D, x2 - 3.0D, y1 + 7.0D, 1.0D, themeT.getRGB(), 1.0D, 1.0D, 15.0D, themeT.getRGB());
      }

      if (this.Mary() && lIIIIlllIl(this.Charlie.Oliver, 1.0D) == 0) {
         GL11.glBegin(1);
         GL11.glVertex2d(x2 - 6.0D, y1 + 4.0D);
         GL11.glVertex2d((x2 - 1.0D + (x2 - 6.0D)) / 2.0D, y2 - 4.0D);
         GL11.glEnd();
         GL11.glBegin(1);
         GL11.glVertex2d(x2 - 1.0D, y1 + 4.0D);
         GL11.glVertex2d((x2 - 1.0D + (x2 - 6.0D)) / 2.0D, y2 - 4.0D);
         GL11.glEnd();
         "".length();
         if (null != null) {
            return;
         }
      } else if (this.Charlie != null && lIIIIlllIl(this.Charlie.Oliver, 0.0D) != 0) {
         double var10000;
         if (this.Charlie.Oscar()) {
            var10000 = 1.0D - this.Charlie.Oliver;
            "".length();
            if ("".length() < 0) {
               return;
            }
         } else {
            var10000 = this.Charlie.Oliver;
         }

         double t = var10000;
         RenderUtils.drawCircle((float)(x2 + x2) / 2.0F - 4.0F, (float)(y1 + y2) / 2.0F, 2.0F, theme, 0.5F, 1.0F, (float)t);
      } else {
         GL11.glBegin(1);
         GL11.glVertex2d(x2 - 4.0D, y1 + 3.0D);
         GL11.glVertex2d(x2 - 2.0D, (y1 + y2) / 2.0D);
         GL11.glEnd();
         GL11.glBegin(1);
         GL11.glVertex2d(x2 - 2.0D, (y1 + y2) / 2.0D);
         GL11.glVertex2d(x2 - 4.0D, y2 - 3.0D);
         GL11.glEnd();
         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
      }

      GL11.glDisable(2848);
      GL11.glLineWidth(1.0F);
      "".length();
      if ("  ".length() > " ".length()) {
         ;
      }
   }

   public EnumSettingGUI( EnumSetting<T> setting) {
      this.Jacob = setting;
      this.Oliver = setting;
      this.Jack = this.Oscar();
      this.Harry(this.Oliver());
      this.Jacob(this.George());
      "".length();
      if (-(93 ^ 89) >= 0) {
         throw null;
      }
   }

   private boolean Mary() {
      byte var10000;
      if (this.Charlie != null && !this.Charlie.Oscar()) {
         var10000 = 1;
         "".length();
         if ((139 ^ 195 ^ 210 ^ 158) != (145 + 62 - 96 + 37 ^ 45 + 120 - 159 + 138)) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)("   ".length() != "   ".length() ? "".length() : var1);
   }
}
