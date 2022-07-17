package net.optifine.clickgui.window;

import net.minecraft.class_1041;
import net.minecraft.class_4587;
import net.optifine.clickgui.PartOfGUI;
import net.optifine.features.module.Category;
import net.optifine.features.module.hud.ClickGuiModule;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Iterator;

public class CategoryWindow extends AbstractWindow {
   // $FF: synthetic field
   public Category George;
   // $FF: synthetic field
   public static double Thomas = 0.0D;
   // $FF: synthetic field
   double Oscar = 0.0D;

   static {
      "".length();
      if (" ".length() <= (11 ^ 36 ^ 116 ^ 95)) {
         ;
      }
   }

   public final void Oliver(boolean minimized) {
      this.Harry = minimized;
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   private static int llllIlIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llllIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Thomas() {
      double maxChildWidth = 0.0D;
      Iterator var3 = this.Oliver.iterator();

      while(var3.hasNext()) {
         PartOfGUI c = ( PartOfGUI )var3.next();
         if (llllIlIII(c.Oliver(), maxChildWidth) > 0) {
            maxChildWidth = c.Oliver();
         }

         "".length();
         if ((39 ^ 35) < 0) {
            return;
         }
      }

      double childrenHeight = 25.0D;
      Iterator var5 = this.Oliver.iterator();

      while(var5.hasNext()) {
         PartOfGUI c = ( PartOfGUI )var5.next();
         childrenHeight += c.Charlie() + 2.0D;
         "".length();
         if ("   ".length() < 0) {
            return;
         }
      }

      childrenHeight += 2.0D;
      if (llllIlIII(childrenHeight, this.Charlie + 25.0D) > 0 && llllIlIII(this.Charlie, 0.0D) > 0) {
         this.Jacob(this.Charlie + 25.0D);
         "".length();
         if ((19 + 169 - 1 + 1 ^ 14 + 61 - 33 + 143) <= 0) {
            return;
         }
      } else {
         this.Jacob(childrenHeight);
      }

      Thomas = Math.max((double)(Global.Harry.getGeneric().getWidth(this.Oliver()) + 12.0F), Thomas);
      Thomas = Math.max(maxChildWidth, Thomas);
      this.George();
      "".length();
      if (null == null) {
         ;
      }
   }

   public final boolean Margaret() {
      byte var1 = this.Harry;
      "".length();
      return (boolean)(-"   ".length() > 0 ? "".length() : var1);
   }

   private static int llllIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public CategoryWindow(Category category) {
      super(category.Oliver());
      this.George = category;
      "".length();
      if (-(73 ^ 76) >= 0) {
         throw null;
      }
   }

   public void Oliver(class_4587 matrixStack, int mouseX, int mouseY, float partialTicks) {
      this.Sarah();
      this.Jessica();
      this.George();
      double windowStartX = this.Jack();
      double windowStartY = this.Harry();
      double windowEndX = windowStartX + this.Jacob();
      double windowEndY = windowStartY + Math.max(this.Mary(), this.Charlie()) + 4.0D;
      double titleEndY = windowStartY + 25.0D;
      if (llllIlIIl((double)mouseX, windowStartX) >= 0 && llllIlIIl((double)mouseY, windowStartY) >= 0 && llllIlIlI((double)mouseX, windowEndX) < 0 && llllIlIlI((double)mouseY, windowEndY) < 0) {
         Global.Charlie().Oliver("");
      }

      GL11.glDisable(3553);
      if (Global.Jack().Elizabeth.Linda()) {
         if (llllIlIlI(this.Charlie(), 25.0D) <= 0) {
            windowEndY -= 4.0D;
         }

         RenderUtils.drawRoundedRect(windowStartX - 2.0D, windowStartY - 2.0D, windowEndX + 2.0D, windowEndY + 2.0D, 2.0D, ThemeHelper.getColor().getRGB());
         RenderUtils.drawRoundedRect(windowStartX - 1.5D, windowStartY - 1.5D, windowEndX + 1.5D, windowEndY + 1.5D, 2.0D, ThemeHelper.getHoveredColor().getRGB());
         RenderUtils.drawRoundedRect(windowStartX - 1.0D, windowStartY - 1.0D, windowEndX + 1.0D, windowEndY + 1.0D, 2.0D, ThemeHelper.getColor().getRGB());
         RenderUtils.drawRoundedRect(windowStartX - 0.5D, windowStartY - 0.5D, windowEndX + 0.5D, windowEndY + 0.5D, 2.0D, ThemeHelper.getHoveredColor().getRGB());
         if (llllIlIlI(this.Charlie(), 25.0D) <= 0) {
            windowEndY += 2.0D;
         }
      }

      ClickGuiModule clickGui = Global.Jack().Elizabeth;
      Color bg = ThemeHelper.getFadeColor();
      double x2;
      if (llllIlIIl(this.Charlie(), 25.0D) > 0) {
         RenderUtils.drawRoundedRect(windowStartX, titleEndY - 4.0D, windowEndX, windowEndY, 2.0D, ThemeHelper.getColor().getRGB());
         if (!clickGui.Margaret()) {
            RenderUtils.drawGradientRect(windowStartX, titleEndY - 2.0D, windowEndX, windowEndY + 2.0D, bg, new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), 0));
         }

         x2 = titleEndY + this.Patricia();
         class_1041 sr = Global.Oliver.method_22683();
         double sf = sr.method_4495();
         GL11.glScissor((int)(windowStartX * sf), (int)(((double)sr.method_4502() - windowEndY) * sf), (int)(windowEndX * sf), (int)((windowEndY - titleEndY) * sf));
         GL11.glEnable(3089);
         GL11.glPushMatrix();
         GL11.glTranslated(windowStartX, x2, 0.0D);
         double cMouseX = (double)mouseX - windowStartX;
         double cMouseY = (double)mouseY - x2;
         int i = 0;

         while(i < this.James()) {
            this.Oliver(i).Oliver(matrixStack, cMouseX, cMouseY, partialTicks);
            ++i;
            "".length();
            if (" ".length() == "   ".length()) {
               return;
            }
         }

         GL11.glPopMatrix();
         GL11.glDisable(3089);
      }

      RenderUtils.drawRoundedRectWithShadow(windowStartX, windowStartY, windowEndX, windowEndY - 6.0D, 2.0D, 0, 0.0D, 0.0D, 15.0D, ThemeHelper.getColor().getRGB());
      RenderUtils.drawRoundedRect(windowStartX, windowStartY, windowEndX, titleEndY, 2.0D, ThemeHelper.getColor().getRGB());
      if (clickGui.Margaret() && llllIlIIl(this.Charlie(), 25.0D) > 0) {
         RenderUtils.drawRoundedRect(windowStartX + 6.0D, titleEndY - 3.0D, windowEndX - 6.0D, titleEndY - 2.0D, 0.25D, bg.getRGB());
      }

      x2 = windowStartX + 25.0D;
      double y2 = windowStartY + 25.0D;
      ThemeManager.usePrimaryColor(1.0F, windowStartY);
      this.George.Jack().render(windowStartX, windowStartY, x2, y2);
      TTFFontRenderer font = Global.Harry.getGeneric();
      float h = (float)(12.5D - (double)(font.getHeight(this.Oliver()) / 2.0F));
      font.drawString(String.valueOf((new StringBuilder()).append("§l").append(this.Oliver())), windowStartX + 25.0D + 1.0D, windowStartY + (double)h, ThemeHelper.getHeaderTextColor().getRGB());
      "".length();
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   private void Jessica() {
      double scroll = this.Patricia() + this.Jennifer();
      scroll = Math.min(scroll, 0.0D);
      scroll = Math.max(scroll, -this.William() + this.Charlie() - 25.0D);
      this.Thomas(scroll);
      this.George(this.Jennifer() / Math.pow(2.0D, (double)Global.Oliver.method_1534()));
      "".length();
      if (-" ".length() <= "   ".length()) {
         ;
      }
   }

   private void Sarah() {
      if (this.Harry) {
         this.Oscar -= (double)(Global.Oliver.method_1534() / 2.0F) * (1.0D - Math.abs(this.Oscar * 2.0D - 1.0D) + 0.01D);
         "".length();
         if ("  ".length() > (63 ^ 10 ^ 60 ^ 13)) {
            return;
         }
      } else {
         this.Oscar += (double)(Global.Oliver.method_1534() / 2.0F) * (1.0D - Math.abs(this.Oscar * 2.0D - 1.0D) + 0.01D);
      }

      this.Oscar = MathUtils.clamp(0.0D, this.Oscar, 1.0D);
      this.Jacob(this.Oscar * Math.min(this.William(), (double)Global.Oliver.method_22683().method_4502() * 0.7D) + 25.0D);
      "".length();
      if (null == null) {
         ;
      }
   }
}
