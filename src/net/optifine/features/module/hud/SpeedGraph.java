package net.optifine.features.module.hud;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PreMotionListener;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.optifine.util.theme.ThemeManager.ThemeHelper;
import net.minecraft.class_4587;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SpeedGraph extends Module implements Render2DListener, PreMotionListener {
   // $FF: synthetic field
   private final NumberSetting Susan;
   // $FF: synthetic field
   private final BooleanSetting Mary;
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Jessica;
   // $FF: synthetic field
   ConcurrentLinkedQueue<Double> Jack;
   // $FF: synthetic field
   private final BooleanSetting James;
   // $FF: synthetic field
   private final BooleanSetting Patricia;
   // $FF: synthetic field
   private final ColorPickerSetting OlIver;
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Jennifer;
   // $FF: synthetic field
   private final NumberSetting Oscar;
   // $FF: synthetic field
   private final DoubleSliderSetting George;
   // $FF: synthetic field
   private final BooleanSetting William;
   // $FF: synthetic field
   private final ColorPickerSetting Linda;
   // $FF: synthetic field
   private final ColorPickerSetting Margaret;
   // $FF: synthetic field
   private final NumberSetting Sarah;
   // $FF: synthetic field
   private final NumberSetting Elizabeth;
   // $FF: synthetic field
   private final NumberSetting Harry;
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Barbara;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final NumberSetting Thomas;
   // $FF: synthetic field
   private final NumberSetting Charlie;

   public SpeedGraph() {
      super("SpeedGraph", "Shows speed graph and your bps", Category.Thomas);
      this.Harry = new NumberSetting("Length", "Length of graph (in ticks)", 100.0D, 10.0D, 400.0D, 1.0D, ValueDisplay.Jack);
      this.Jacob = new NumberSetting("Width", 80.0D, 0.0D, 300.0D, 0.5D);
      this.Charlie = new NumberSetting("Height", 20.0D, 0.0D, 300.0D, 0.5D);
      this.Thomas = new NumberSetting("Max Speed", 1.0D, 0.2D, 8.0D, 0.5D);
      this.George = new DoubleSliderSetting("Position", 0.5D, 0.8D, true);
      this.Oscar = new NumberSetting("Line Width", 2.0D, 0.0D, 5.0D, 0.1D);
      this.James = new BooleanSetting("Draw Graph", true);
      this.William = new BooleanSetting("Draw Percents", true);
      this.Mary = new BooleanSetting("Draw BPS", true);
      this.Patricia = new BooleanSetting("Dynamic Maximum", true);
      this.Jennifer = new EnumSetting("Background Color Mode", ColorMode.values(), ColorMode.Oliver);
      this.Elizabeth = new NumberSetting("Background Opacity", 0.5D, 0.0D, 1.0D, 0.01D);
      this.Linda = new ColorPickerSetting("Background Color");
      this.Barbara = new EnumSetting("Line Color Mode", ColorMode.values(), ColorMode.Oliver);
      this.Susan = new NumberSetting("Line Opacity", 0.5D, 0.0D, 1.0D, 0.01D);
      this.Margaret = new ColorPickerSetting("Line Color");
      this.Jessica = new EnumSetting("Text Color Mode", ColorMode.values(), ColorMode.Oliver);
      this.Sarah = new NumberSetting("Text Opacity", 0.5D, 0.0D, 1.0D, 0.01D);
      this.OlIver = new ColorPickerSetting("Text Color");
      this.Jack = new ConcurrentLinkedQueue();
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(this.James);
      this.addSetting(this.Thomas);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jennifer);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      this.addSetting(this.Barbara);
      this.addSetting(this.Susan);
      this.addSetting(this.Margaret);
      this.addSetting(this.Jessica);
      this.addSetting(this.Sarah);
      this.addSetting(this.OlIver);
      "".length();
      if ("   ".length() <= -" ".length()) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      this.Jack.clear();
      "".length();
      if ((67 ^ 127 ^ 77 ^ 117) > "   ".length()) {
         ;
      }
   }

   public void George() {
      if (mc.field_1724 == null) {
         "".length();
         if ("   ".length() != "   ".length()) {
            return;
         }
      } else {
         while(true) {
            if (this.Jack.size() < this.Harry.Oscar()) {
               double x = mc.field_1724.field_6014 - mc.field_1724.method_19538().field_1352;
               double z = mc.field_1724.field_5969 - mc.field_1724.method_19538().field_1350;
               double speed = Math.sqrt(x * x + z * z);
               this.Jack.add(speed * (double)Timer.Jack);
               "".length();
               "".length();
               if (-" ".length() == "".length()) {
                  return;
               }
               break;
            }

            this.Jack.remove();
            "".length();
            "".length();
            if (" ".length() < 0) {
               return;
            }
         }
      }

   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      float mcWidth = (float)mc.method_22683().method_4486();
      float mcHeight = (float)mc.method_22683().method_4502();
      double x1 = (double)(mcWidth / 2.0F - this.Jacob.George()) + (double)mcWidth * (this.George.Oscar() - 0.5D);
      double x2 = (double)(mcWidth / 2.0F + this.Jacob.George()) + (double)mcWidth * (this.George.Oscar() - 0.5D);
      double y1 = (double)mcHeight + (double)mcHeight * -this.George.James();
      double y2 = y1 + (double)this.Charlie.George();
      int size = this.Jack.size();
      double oneLine = (x2 - x1) / (double)size;
      int times = 1;
      double speed;
      Iterator var19;
      double speed;
      Color c;
      if (this.Mary.Jack() || this.William.Jack()) {
         speed = 0.0D;
         var19 = this.Jack.iterator();

         while(var19.hasNext()) {
            speed = (Double)var19.next();
            speed += speed;
            "".length();
            if (-(8 ^ 97 ^ 252 ^ 145) > 0) {
               return;
            }
         }

         speed /= (double)this.Jack.size();
         StringBuilder var10000 = new StringBuilder();
         String var10001;
         if (this.Mary.Jack()) {
            var10001 = String.valueOf((new StringBuilder()).append("BPS: ").append((double)((int)(speed * 20.0D * 100.0D)) / 100.0D).append(" "));
            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else {
            var10001 = "";
         }

         var10000 = var10000.append(var10001);
         if (this.William.Jack()) {
            var10001 = String.valueOf((new StringBuilder()).append((double)((int)((speed / 0.36000001430511475D * 100.0D - 100.0D) * 100.0D)) / 100.0D).append("% faster"));
            "".length();
            if (("  ".length() ^ 169 ^ 175) > (138 ^ 176 ^ 142 ^ 176)) {
               return;
            }
         } else {
            var10001 = "";
         }

         String s = String.valueOf(var10000.append(var10001));
         if (this.Jessica.Harry() == ColorMode.Oliver) {
            c = ThemeHelper.getFontColor();
            "".length();
            if (" ".length() < 0) {
               return;
            }
         } else {
            c = this.OlIver.Oscar();
         }

         Color color = new Color(c.getRed(), c.getGreen(), c.getBlue(), (int)(this.Sarah.George() * 255.0F));
         Global.Harry.getSmallMain().drawCenteredString(s, (double)(mcWidth / 2.0F) + (double)mcWidth * (this.George.Oscar() - 0.5D), y2 + (double)Global.Harry.getGeneric().getHeight(s), color.getRGB());
      }

      if (this.James.Jack()) {
         speed = 0.0D;
         var19 = this.Jack.iterator();

         while(var19.hasNext()) {
            speed = (Double)var19.next();
            double clampedSpeed = MathUtils.clamp(0.0D, speed * (double)(1.0F / this.Thomas.George()), 1.0D);
            if (lIIIlIIIll(clampedSpeed, speed) > 0) {
               speed = clampedSpeed;
            }

            "".length();
            if (-" ".length() >= (40 ^ 60 ^ 102 ^ 118)) {
               return;
            }
         }

         Color co;
         if (this.Jennifer.Harry() == ColorMode.Oliver) {
            co = ThemeHelper.getColor();
            "".length();
            if (-(4 ^ 0) >= 0) {
               return;
            }
         } else {
            co = this.Linda.Oscar();
         }

         c = new Color(co.getRed(), co.getGreen(), co.getBlue(), (int)(this.Elizabeth.George() * 255.0F));
         double dynamicHeightValue = 1.0D;
         double var43;
         if (this.Patricia.Jack()) {
            var43 = this.Jack.stream().mapToDouble((v) -> {
               double var1 = v;
               "".length();
               return "".length() >= "   ".length() ? 0.0D : var1;
            }).max().orElseThrow(NoSuchElementException::new);
            "".length();
            if (-" ".length() >= "   ".length()) {
               return;
            }
         } else {
            var43 = (double)this.Thomas.George();
         }

         double rate = var43;
         if (lIIIlIIIll(rate, 1.0D) > 0) {
            rate = 1.0D / rate;
         }

         double graphHeight = (double)this.Charlie.George();
         double var44;
         if (!this.Patricia.Jack() || lIIIlIIIll(graphHeight * dynamicHeightValue, 1.0D) > 0) {
            var44 = (double)mcHeight + (double)mcHeight * -this.George.James() + (graphHeight - graphHeight * dynamicHeightValue);
            double var10005;
            if (lIIIlIIlII(graphHeight * dynamicHeightValue, 5.0D) < 0) {
               var10005 = graphHeight * dynamicHeightValue / 5.0D;
               "".length();
               if (-" ".length() > "   ".length()) {
                  return;
               }
            } else {
               var10005 = 1.0D;
            }

            RenderUtils.drawRoundedRectWithShadow(x1, var44, x2, y2, 2.0D * var10005, c.getRGB(), 0.0D, 0.0D, 15.0D, c.getRGB());
         }

         GL11.glDisable(3553);
         RenderUtils.setLineWidth(this.Oscar.George());
         double lastY = -69.0D;
         double lastX = -69.0D;
         GL11.glBegin(1);
         Iterator var31 = this.Jack.iterator();

         while(var31.hasNext()) {
            double speed = (Double)var31.next();
            double clampedSpeed = MathUtils.clamp(0.0D, speed * rate, 1.0D);
            float[] color = this.Oliver(times * 12);
            double diff = (y1 - y2) * clampedSpeed;
            double xPos = x1 + oneLine * (double)times;
            double y3 = y2 + diff;
            GL11.glColor4f(color[0], color[1], color[2], color[3]);
            if (lIIIlIIIll(lastX, -69.0D) == 0) {
               var43 = x1;
               "".length();
               if (" ".length() == "".length()) {
                  return;
               }
            } else {
               var43 = lastX;
            }

            if (lIIIlIIIll(lastY, -69.0D) == 0) {
               var44 = y3;
               "".length();
               if (" ".length() >= "  ".length()) {
                  return;
               }
            } else {
               var44 = lastY;
            }

            GL11.glVertex2d(var43, var44);
            GL11.glVertex2d(xPos, y3);
            ++times;
            lastX = xPos;
            lastY = y3;
            "".length();
            if (-" ".length() > " ".length()) {
               return;
            }
         }

         GL11.glEnd();
         GL11.glDisable(2848);
      }

      "".length();
      if (" ".length() <= "   ".length()) {
         ;
      }
   }

   private float[] Oliver(int index) {
      Color c;
      if (this.Barbara.Harry() == ColorMode.Oliver) {
         c = ThemeManager.getPrimaryColor((double)index);
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         c = this.Margaret.Oscar();
      }

      float[] var3 = new float[]{(float)c.getRed() / 255.0F, (float)c.getGreen() / 255.0F, (float)c.getBlue() / 255.0F, this.Susan.George()};
      "".length();
      return "".length() != 0 ? null : var3;
   }

   private static int lIIIlIIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIlIIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      "".length();
      if ("".length() != -" ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   private static enum ColorMode {
      // $FF: synthetic field
      Oliver("Themed"),
      // $FF: synthetic field
      Jack("Static");

      // $FF: synthetic field
      private final String Harry;

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return -"  ".length() >= 0 ? null : var1;
      }

      private ColorMode(String name) {
         this.Harry = name;
         "".length();
         if ("  ".length() <= 0) {
            throw null;
         }
      }

      static {
         "".length();
         if (" ".length() > 0) {
            ;
         }
      }
   }
}
