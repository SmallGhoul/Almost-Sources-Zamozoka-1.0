package net.optifine.features.module.render;

import net.optifine.config.BooleanSetting;
import net.optifine.config.ColorPickerSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.class_1297;
import net.minecraft.class_2708;
import net.minecraft.class_4184;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class PlayerTrail extends Module implements PacketInputListener, UpdateListener, RenderListener {
   // $FF: synthetic field
   ConcurrentLinkedDeque<Float[]> Jack;
   // $FF: synthetic field
   private final NumberSetting James;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   private final EnumSetting< ColorMode> Oscar;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final ColorPickerSetting William;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final NumberSetting Harry;
   // $FF: synthetic field
   private final BooleanSetting George;

   public PlayerTrail() {
      super("Trail", "Renders a trail for your moves", Category.Harry);
      this.Harry = new NumberSetting("Length", "Length of trail (in ticks)", 100.0D, 10.0D, 400.0D, 1.0D, ValueDisplay.Jack);
      this.Jacob = new NumberSetting("Width", 1.0D, 0.01D, 10.0D, 0.01D, ValueDisplay.Oliver);
      this.Charlie = new NumberSetting("Color Spread", 12.0D, 1.0D, 30.0D, 0.01D, ValueDisplay.Oliver);
      this.Thomas = new BooleanSetting("Enable DepthTest", false);
      this.George = new BooleanSetting("Enable Fade", true);
      this.Oscar = new EnumSetting("Color Mode", ColorMode.values(), ColorMode.Oliver);
      this.James = new NumberSetting("Opacity", 0.5D, 0.0D, 1.0D, 0.01D, ValueDisplay.Oliver);
      this.William = new ColorPickerSetting("Color");
      this.Jack = new ConcurrentLinkedDeque();
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.George);
      this.addSetting(this.Thomas);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private float[] Oliver(int index) {
      Color c;
      if (this.Oscar.Harry() == ColorMode.Oliver) {
         c = ThemeManager.getPrimaryColor((double)index);
         "".length();
         if ("   ".length() <= " ".length()) {
            return null;
         }
      } else {
         c = this.William.Oscar();
      }

      float[] var3 = new float[]{(float)c.getRed() / 255.0F, (float)c.getGreen() / 255.0F, (float)c.getBlue() / 255.0F, this.James.George()};
      "".length();
      return "  ".length() < 0 ? null : var3;
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      this.Jack.clear();
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Thomas() {
      while(true) {
         if (this.Jack.size() >= this.Harry.Oscar()) {
            this.Jack.removeLast();
            "".length();
            "".length();
            if (-" ".length() < "   ".length()) {
               continue;
            }

            return;
         }

         Float[] pos = new Float[]{(float)mc.field_1724.method_23317(), (float)mc.field_1724.method_23318() + 0.2F, (float)mc.field_1724.method_23321()};
         if (this.Jack.size() == 0 || !Arrays.equals((Object[])this.Jack.getFirst(), pos)) {
            this.Jack.addFirst(pos);
         }

         "".length();
         if ("  ".length() == 0) {
            return;
         }

         return;
      }
   }

   static {
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   public void Oliver(float partialTicks) {
      GL11.glPushMatrix();
      GL11.glDisable(3553);
      GL11.glEnable(2848);
      GL11.glHint(3154, 4354);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      if (!this.Thomas.Jack()) {
         GL11.glDisable(2929);
         "".length();
         if (-" ".length() >= " ".length()) {
            return;
         }
      } else {
         GL11.glEnable(2929);
      }

      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      class_4184 cam = mc.field_1773.method_19418();
      GL11.glRotatef(cam.method_19329(), 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(cam.method_19330(), 0.0F, 1.0F, 0.0F);
      RenderUtils.setLineWidth(this.Jacob.George());
      GL11.glBegin(3);
      int index = 0;
      int size = this.Jack.size();
      Iterator var5 = this.Jack.iterator();

      do {
         if (!var5.hasNext()) {
            class_1297 entity = mc.field_1724;
            double interpY = entity.field_5971 + (entity.method_23318() - entity.field_6036) * (double)partialTicks;
            double x = cam.method_19326().method_10216() - (entity.field_6038 + (entity.method_23317() - entity.field_6014) * (double)partialTicks);
            double y = interpY - cam.method_19326().method_10214() + interpY;
            double z = cam.method_19326().method_10215() - (entity.field_5989 + (entity.method_23321() - entity.field_5969) * (double)partialTicks);
            GL11.glVertex3d(x, y, z);
            GL11.glColor4d(1.0D, 1.0D, 1.0D, 1.0D);
            GL11.glEnd();
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDisable(3042);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
            "".length();
            if (null != null) {
               return;
            }

            return;
         }

         Float[] pos = (Float[])var5.next();
         ++index;
         double renderPosX = cam.method_19326().method_10216() - (double)pos[0];
         double renderPosY = (double)pos[1] - cam.method_19326().method_10214();
         double renderPosZ = cam.method_19326().method_10215() - (double)pos[2];
         float[] color = this.Oliver((int)((float)index * this.Charlie.George()));
         float var10000;
         if (this.George.Jack()) {
            var10000 = Math.min((float)(size - index), (float)size / 3.0F) / ((float)size / 3.0F);
            "".length();
            if (" ".length() < " ".length()) {
               return;
            }
         } else if (size == index) {
            var10000 = 0.0F;
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         } else {
            var10000 = 1.0F;
         }

         float alpha = var10000;
         GL11.glColor4f(color[0], color[1], color[2], color[3] * alpha);
         GL11.glVertex3d(renderPosX, renderPosY, renderPosZ);
         "".length();
      } while(" ".length() != 0);

   }

   public void Oliver(PacketInputEvent event) {
      if (event.Jacob() instanceof class_2708) {
         this.Jack.clear();
      }

      "".length();
      if ("   ".length() != " ".length()) {
         ;
      }
   }

   private static enum ColorMode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Oliver("Themed"),
      // $FF: synthetic field
      Jack("Static");

      static {
         "".length();
         if (-"   ".length() <= 0) {
            ;
         }
      }

      private ColorMode(String name) {
         this.Harry = name;
         "".length();
         if (null != null) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "  ".length() >= (140 ^ 136) ? null : var1;
      }
   }
}
