package net.optifine.features.module.render;

import com.sun.javafx.geom.CubicCurve2D;
import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class TargetESP extends Module implements RenderListener, PacketOutputListener {
   // $FF: synthetic field
   private final CubicCurve2D HaRry;
   // $FF: synthetic field
   private final NumberSetting Margaret;
   // $FF: synthetic field
   private final BooleanSetting Mary;
   // $FF: synthetic field
   private final NumberSetting William;
   // $FF: synthetic field
   private final NumberSetting Jennifer;
   // $FF: synthetic field
   private double CharliE;
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Sarah;
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Barbara;
   // $FF: synthetic field
   private final NumberSetting JaCk;
   // $FF: synthetic field
   private final NumberSetting James;
   // $FF: synthetic field
   private final EnumSetting< Mode> Thomas;
   // $FF: synthetic field
   private final ColorPickerSetting Susan;
   // $FF: synthetic field
   class_1297 Jacob;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   long Charlie;
   // $FF: synthetic field
   private final ColorPickerSetting OlIver;
   // $FF: synthetic field
   private double ThomaSS;
   // $FF: synthetic field
   public static final ColorMode[] Harry = ColorMode.values();
   // $FF: synthetic field
   private final NumberSetting Oscar;
   // $FF: synthetic field
   private int JacoB;
   // $FF: synthetic field
   private final BooleanSetting Patricia;
   // $FF: synthetic field
   public static final Mode[] Jack = Mode.values();
   // $FF: synthetic field
   private final BooleanSetting Jessica;
   // $FF: synthetic field
   private final NumberSetting Linda;
   // $FF: synthetic field
   private final NumberSetting Elizabeth;

   protected void Jacob() {
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      this.CharliE = 0.0D;
      this.JacoB = GL11.glGenLists(1);
      GL11.glNewList(this.JacoB, 4864);
      class_238 bb = new class_238(-0.5D, 0.0D, -0.5D, 0.5D, 1.0D, 0.5D);
      RenderUtils.drawSolidBox(bb);
      GL11.glEndList();
      "".length();
      if (" ".length() != "".length()) {
         ;
      }
   }

   private static int lllIlIIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2824) {
         this.Jacob = ((class_2824)event.Jacob()).method_12248(mc.field_1687);
         this.Charlie = System.currentTimeMillis();
      }

      if (this.George.Jack()) {
         this.Jacob = Global.Jack().JacoB.Jennifer();
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   private float[] Thomas() {
      int alpha = (int)(this.HaRry.eval((float)(this.ThomaSS / 3.0D + 0.5D)).y * 255.0F * this.Margaret.George());
      Color c;
      if (this.Barbara.Harry() == ColorMode.Oliver) {
         c = ThemeManager.getPrimaryColor();
         "".length();
         if (-" ".length() > (145 ^ 149)) {
            return null;
         }
      } else {
         c = this.Susan.Oscar();
      }

      long delta = System.currentTimeMillis() - this.Charlie;
      if (this.Jessica.Jack() && lllIlIIlII((double)delta, 300.0D) < 0) {
         alpha = (int)(this.HaRry.eval((float)(this.ThomaSS / 3.0D + 0.5D)).y * 255.0F * this.JaCk.George());
         Color z;
         if (this.Sarah.Harry() == ColorMode.Oliver) {
            z = ThemeManager.getPrimaryColor();
            "".length();
            if (-" ".length() >= "   ".length()) {
               return null;
            }
         } else {
            z = this.OlIver.Oscar();
         }

         double val = (double)((class_1309)this.Jacob).field_6235 / 10.0D;
         c = new Color((int)MathUtils.clamp(0.0D, (double)c.getRed() * val + (1.0D - val) * (double)z.getRed(), 255.0D), (int)MathUtils.clamp(0.0D, (double)c.getGreen() * val + (1.0D - val) * (double)z.getGreen(), 255.0D), (int)MathUtils.clamp(0.0D, (double)c.getBlue() * val + (1.0D - val) * (double)z.getBlue(), 255.0D), (int)MathUtils.clamp(0.0D, (double)c.getAlpha() * val + (1.0D - val) * (double)z.getAlpha(), 255.0D));
      }

      float[] var7 = new float[]{(float)c.getRed() / 255.0F, (float)c.getGreen() / 255.0F, (float)c.getBlue() / 255.0F, (float)alpha / 255.0F};
      "".length();
      return -(132 ^ 128) >= 0 ? null : var7;
   }

   public TargetESP() {
      super("TargetESP", "Spawns special ESP for your target", Category.Harry);
      this.Thomas = new EnumSetting("ESP Mode", Jack, Mode.Oliver);
      this.George = new BooleanSetting("Only On Aura", true);
      this.Oscar = new NumberSetting("Timer After Hit", 3000.0D, 0.0D, 3000.0D, 10.0D, ValueDisplay.Jack);
      this.James = new NumberSetting("Jello-Speed", 1.0D, 0.01D, 10.0D, 0.01D);
      this.William = new NumberSetting("Radius", 0.62D, 0.01D, 3.0D, 0.01D);
      this.Mary = new BooleanSetting("HitBox Radius", true);
      this.Patricia = new BooleanSetting("Enable DepthTest", false);
      this.Jennifer = new NumberSetting("Scale", 0.62D, 0.01D, 3.0D, 0.01D);
      this.Elizabeth = new NumberSetting("Height", 0.2D, 0.01D, 0.5D, 0.01D);
      this.Linda = new NumberSetting("Plane-Speed", 1.0D, 0.01D, 10.0D, 0.01D);
      this.Barbara = new EnumSetting("Color Mode", Harry, ColorMode.Oliver);
      this.Susan = new ColorPickerSetting("Color");
      this.Margaret = new NumberSetting("Opacity", 0.5D, 0.0D, 1.0D, 0.01D);
      this.Jessica = new BooleanSetting("Damage Animation", true);
      this.Sarah = new EnumSetting("Color Mode Animation", Harry, ColorMode.Oliver);
      this.OlIver = new ColorPickerSetting("Color for Animation");
      this.JaCk = new NumberSetting("Opacity for Animation", 0.5D, 0.0D, 1.0D, 0.01D);
      this.HaRry = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.Jacob = null;
      this.Charlie = -69L;
      this.CharliE = 0.0D;
      this.ThomaSS = -1.5D;
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(new Splitter("Jello-Circle Settings", "Next settings are needed to configure jello-like target esp.\nIt's a circle with cool fade. You can change speed, radius, etc."));
      this.addSetting(this.William);
      this.addSetting(this.James);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(new Splitter("Plane Settings", "Next settings are needed to configure plane target esp."));
      this.addSetting(this.Jennifer);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      this.addSetting(new Splitter("Color Settings", "Next settings are needed to configure color for target esp."));
      this.addSetting(this.Barbara);
      this.addSetting(this.Susan);
      this.addSetting(this.Margaret);
      this.addSetting(this.Jessica);
      this.addSetting(this.Sarah);
      this.addSetting(this.OlIver);
      this.addSetting(this.JaCk);
      "".length();
      if ((167 ^ 163) <= 0) {
         throw null;
      }
   }

   static {
      "".length();
      if (" ".length() <= "   ".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      "".length();
      if ("   ".length() < (53 ^ 49)) {
         ;
      }
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Thomas.Harry());
      "".length();
      return "   ".length() == 0 ? null : var1;
   }

   private static int lllIlIIIll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public void Oliver(float partialTicks) {
      if (this.Jacob == null) {
         "".length();
         if ("   ".length() == -" ".length()) {
            return;
         }
      } else if (this.George.Jack() && !Global.Jack().JacoB.isEnabled()) {
         "".length();
         if (-" ".length() > 0) {
            return;
         }
      } else if (!this.George.Jack() && lllIlIIIll(this.Charlie, -69L) != 0 && lllIlIIIll(System.currentTimeMillis() - this.Charlie, (long)this.Oscar.Oscar()) > 0) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         double var10001 = this.ThomaSS;
         double var10002;
         if (this.Jacob != null) {
            var10002 = (double)Global.Oliver.method_1534();
            "".length();
            if (" ".length() != " ".length()) {
               return;
            }
         } else {
            var10002 = (double)(-Global.Oliver.method_1534());
         }

         this.ThomaSS = var10001 + var10002;
         this.ThomaSS = MathUtils.clamp(-1.5D, this.ThomaSS, 1.5D);
         switch(( Mode)this.Thomas.Harry()) {
         case Oliver:
            this.CharliE += (double)mc.method_1534() * 0.1D * (double)this.James.George();
            GL11.glPushMatrix();
            class_4493.method_21974(false);
            GL11.glDisable(3553);
            class_4493.method_22078();
            if (!this.Patricia.Jack()) {
               GL11.glDisable(2929);
               "".length();
               if ((35 ^ 29 ^ 189 ^ 134) == 0) {
                  return;
               }
            } else {
               GL11.glEnable(2929);
            }

            GL11.glEnable(3042);
            GL11.glShadeModel(7425);
            GL11.glBlendFunc(770, 771);
            GL11.glTranslatef(0.0F, 0.0F, 0.0F);
            class_4184 cam = mc.field_1773.method_19418();
            GL11.glRotatef(cam.method_19329(), 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(cam.method_19330(), 0.0F, 1.0F, 0.0F);
            class_238 box = this.Jacob.method_5829();
            double x = cam.method_19326().method_10216() - (this.Jacob.field_6038 + (this.Jacob.method_23317() - this.Jacob.field_6014) * (double)partialTicks);
            double y = this.Jacob.field_5971 + (this.Jacob.method_23318() - this.Jacob.field_6036) * (double)partialTicks - cam.method_19326().method_10214() + Math.sin(this.CharliE) * (double)this.Jacob.method_17682() / 2.0D + (double)(this.Jacob.method_17682() / 2.0F);
            double y1 = this.Jacob.field_5971 + (this.Jacob.method_23318() - this.Jacob.field_6036) * (double)partialTicks - cam.method_19326().method_10214() + Math.sin(this.CharliE - 1.0D) * (double)this.Jacob.method_17682() / 2.0D + (double)(this.Jacob.method_17682() / 2.0F);
            double z = cam.method_19326().method_10215() - (this.Jacob.field_5989 + (this.Jacob.method_23321() - this.Jacob.field_5969) * (double)partialTicks);
            double var10000;
            if (this.Mary.Jack()) {
               var10000 = Math.max(box.method_17939(), box.method_17941()) + 0.2D;
               "".length();
               if ("".length() == "   ".length()) {
                  return;
               }
            } else {
               var10000 = (double)this.William.George();
            }

            double rad = var10000;
            double TwoPI = 6.283185307179586D;
            GL11.glBegin(8);
            float[] color = this.Thomas();
            int qual = (int)MathUtils.clamp(25.0D, RenderUtils.quality * 200.0D, 100.0D);
            int i = 0;

            while(i <= qual) {
               double x1 = x + rad * Math.cos((double)i * TwoPI / (double)qual);
               double z1 = z + rad * Math.sin((double)i * TwoPI / (double)qual);
               GL11.glColor4f(color[0], color[1], color[2], color[3]);
               GL11.glVertex3d(x1, y, z1);
               GL11.glColor4f(color[0], color[1], color[2], 0.0F);
               GL11.glVertex3d(x1, y1, z1);
               ++i;
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }

            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glPopMatrix();
            GL11.glEnable(2929);
            "".length();
            if (" ".length() >= "   ".length()) {
               return;
            }
            break;
         case Jack:
            this.CharliE += (double)mc.method_1534() * 0.1D * (double)this.Linda.George();
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glDisable(2896);
            GL11.glPushMatrix();
            RenderUtils.applyRegionalRenderOffset();
            class_2338 camPos = RenderUtils.getCameraBlockPos();
            int regionX = (camPos.method_10263() >> 9) * 512;
            int regionZ = (camPos.method_10260() >> 9) * 512;
            GL11.glTranslated(this.Jacob.field_6014 + (this.Jacob.method_23317() - this.Jacob.field_6014) * (double)partialTicks - (double)regionX, this.Jacob.field_6036 + (this.Jacob.method_23318() - this.Jacob.field_6036) * (double)partialTicks + this.Jacob.method_5829().method_17940() * 1.05D + Math.sin(this.CharliE - 1.0D) * 0.05D, this.Jacob.field_5969 + (this.Jacob.method_23321() - this.Jacob.field_5969) * (double)partialTicks - (double)regionZ);
            float[] color = this.Thomas();
            GL11.glColor4f(color[0], color[1], color[2], color[3]);
            GL11.glScaled((double)this.Jennifer.George(), (double)this.Elizabeth.George(), (double)this.Jennifer.George());
            GL11.glCallList(this.JacoB);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glDisable(3042);
            "".length();
            if (null != null) {
               return;
            }
         }

         "".length();
         if (-" ".length() > "".length()) {
            return;
         }
      }

   }

   private static enum ColorMode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("Themed"),
      // $FF: synthetic field
      Jack("Static");

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "".length() == "   ".length() ? null : var1;
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      private ColorMode(String name) {
         this.Harry = name;
         "".length();
         if ("  ".length() >= (7 ^ 3)) {
            throw null;
         }
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      Jack("Plane"),
      // $FF: synthetic field
      Oliver("Jello-Like");

      // $FF: synthetic field
      private final String Harry;

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if (" ".length() <= 0) {
            throw null;
         }
      }

      static {
         "".length();
         if ((193 ^ 197) > "  ".length()) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return null != null ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Harry;
         "".length();
         return "   ".length() > "   ".length() ? null : var1;
      }
   }
}
