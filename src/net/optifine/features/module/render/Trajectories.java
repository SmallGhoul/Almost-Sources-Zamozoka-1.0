package net.optifine.features.module.render;

import net.optifine.managers.event.events.RenderListener;
import net.optifine.util.RotationUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.*;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Iterator;

public final class Trajectories extends Module implements RenderListener {
   // $FF: synthetic field
   private int Jacob;
   // $FF: synthetic field
   boolean Jack = false;
   // $FF: synthetic field
   class_1297 Harry = null;

   private void Oliver(class_243 end, class_243 camPos, float partialTicks) {
      double renderX = end.field_1352 - camPos.field_1352;
      double renderY = end.field_1351 - camPos.field_1351;
      double renderZ = end.field_1350 - camPos.field_1350;
      class_2338 camPosition = RenderUtils.getCameraBlockPos();
      int regionX = (camPosition.method_10263() >> 9) * 512;
      int regionZ = (camPosition.method_10260() >> 9) * 512;
      ThemeManager.usePrimaryColor(0.3F);
      if (this.Jack) {
         ThemeManager.usePrimaryColor(0.75F);
         GL11.glPushMatrix();
         GL11.glTranslated(this.Harry.field_6014 + (this.Harry.method_23317() - this.Harry.field_6014) * (double)partialTicks - camPos.field_1352, this.Harry.field_6036 + (this.Harry.method_23318() - this.Harry.field_6036) * (double)partialTicks - camPos.field_1351, this.Harry.field_5969 + (this.Harry.method_23321() - this.Harry.field_5969) * (double)partialTicks - camPos.field_1350);
         GL11.glScaled((double)this.Harry.method_17681(), (double)this.Harry.method_17682(), (double)this.Harry.method_17681());
         GL11.glCallList(this.Jacob);
         GL11.glPopMatrix();
         "".length();
         if (-" ".length() < -" ".length()) {
            return;
         }
      } else {
         GL11.glPushMatrix();
         GL11.glTranslated(renderX, renderY - 0.2D, renderZ);
         GL11.glScaled(0.4D, 0.4D, 0.4D);
         GL11.glCallList(this.Jacob);
         GL11.glPopMatrix();
      }

      "".length();
      if ((102 ^ 98) == (5 ^ 1)) {
         ;
      }
   }

   private static int lIlIIlIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private double Oliver(class_1792 item) {
      double var2;
      if (!(item instanceof class_1753) && !(item instanceof class_1764)) {
         if (item instanceof class_1812) {
            var2 = 0.4D;
            "".length();
            if ("   ".length() <= "  ".length()) {
               return 0.0D;
            }
         } else if (item instanceof class_1787) {
            var2 = 0.15D;
            "".length();
            if (-(30 + 51 - -54 + 1 ^ 32 + 79 - -19 + 10) > 0) {
               return 0.0D;
            }
         } else if (item instanceof class_1835) {
            var2 = 0.015D;
            "".length();
            if ((14 ^ 105 ^ 87 ^ 53) <= 0) {
               return 0.0D;
            }
         } else {
            var2 = 0.03D;
            "".length();
            if ("   ".length() < 0) {
               return 0.0D;
            }
         }
      } else {
         var2 = 0.05D;
         "".length();
         if ("   ".length() == -" ".length()) {
            return 0.0D;
         }
      }

      return var2;
   }

   private void Oliver(ArrayList<class_243> path, class_243 camPos) {
      GL11.glBegin(3);
      int i = 0;
      Iterator var4 = path.iterator();

      do {
         if (!var4.hasNext()) {
            GL11.glEnd();
            "".length();
            if (-"   ".length() > 0) {
               return;
            }

            return;
         }

         class_243 point = (class_243)var4.next();
         ThemeManager.usePrimaryColor(0.25F);
         GL11.glVertex3d(point.field_1352 - camPos.field_1352, point.field_1351 - camPos.field_1351, point.field_1350 - camPos.field_1350);
         ++i;
         "".length();
      } while(-(246 ^ 153 ^ 81 ^ 58) <= 0);

   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   private ArrayList<class_243> Jack(float partialTicks) {
      class_746 player = mc.field_1724;
      ArrayList<class_243> path = new ArrayList();
      class_1799 stack = player.method_6047();
      class_1792 item = stack.method_7909();
      ArrayList var35;
      if (!stack.method_7960() && this.Jack(item)) {
         double arrowPosX = player.field_6038 + (player.method_23317() - player.field_6038) * (double)partialTicks - Math.cos(Math.toRadians((double)player.field_6031)) * 0.15D;
         double arrowPosY = player.field_5971 + (player.method_23318() - player.field_5971) * (double)partialTicks + (double)player.method_5751() - 0.1D;
         double arrowPosZ = player.field_5989 + (player.method_23321() - player.field_5989) * (double)partialTicks - Math.sin(Math.toRadians((double)player.field_6031)) * 0.15D;
         double var10000;
         if (item instanceof class_1811) {
            var10000 = 1.0D;
            "".length();
            if (" ".length() < 0) {
               return null;
            }
         } else {
            var10000 = 0.4D;
         }

         double arrowMotionFactor = var10000;
         double yaw = Math.toRadians((double)player.field_6031);
         double pitch = Math.toRadians((double)player.field_5965);
         double arrowMotionX = -Math.sin(yaw) * Math.cos(pitch) * arrowMotionFactor;
         double arrowMotionY = -Math.sin(pitch) * arrowMotionFactor;
         double arrowMotionZ = Math.cos(yaw) * Math.cos(pitch) * arrowMotionFactor;
         double arrowMotion = Math.sqrt(arrowMotionX * arrowMotionX + arrowMotionY * arrowMotionY + arrowMotionZ * arrowMotionZ);
         arrowMotionX /= arrowMotion;
         arrowMotionY /= arrowMotion;
         arrowMotionZ /= arrowMotion;
         if (!(item instanceof class_1811)) {
            arrowMotionX *= 1.5D;
            arrowMotionY *= 1.5D;
            arrowMotionZ *= 1.5D;
         } else {
            float bowPower = (float)(72000 - player.method_6014()) / 20.0F;
            bowPower = (bowPower * bowPower + bowPower * 2.0F) / 3.0F;
            if (lIlIIlIIlI(bowPower, 1.0F) > 0 || lIlIIlIIll(bowPower, 0.1F) <= 0) {
               bowPower = 1.0F;
            }

            bowPower *= 3.0F;
            arrowMotionX *= (double)bowPower;
            arrowMotionY *= (double)bowPower;
            arrowMotionZ *= (double)bowPower;
            "".length();
            if (null != null) {
               return null;
            }
         }

         double gravity = this.Oliver(item);
         class_243 eyesPos = RotationUtils.getEyesPos();
         int i = 0;

         label64:
         while(i < 1000) {
            class_243 arrowPos = new class_243(arrowPosX, arrowPosY, arrowPosZ);
            path.add(arrowPos);
            "".length();
            arrowPosX += arrowMotionX * 0.1D;
            arrowPosY += arrowMotionY * 0.1D;
            arrowPosZ += arrowMotionZ * 0.1D;
            arrowMotionX *= 0.999D;
            arrowMotionY *= 0.999D;
            arrowMotionZ *= 0.999D;
            arrowMotionY -= gravity * 0.1D;
            class_3959 context = new class_3959(eyesPos, arrowPos, class_3960.field_17558, class_242.field_1348, mc.field_1724);
            if (mc.field_1687.method_17742(context).method_17783() != class_240.field_1333) {
               "".length();
               if (-"  ".length() >= 0) {
                  return null;
               }
               break;
            }

            class_238 b = new class_238(new class_243(arrowPosX - 0.01D, arrowPosY - 0.01D, arrowPosZ - 0.01D), new class_243(arrowPosX + 0.01D, arrowPosY + 0.01D, arrowPosZ + 0.01D));
            Iterator var33 = mc.field_1687.method_18112().iterator();

            while(var33.hasNext()) {
               class_1297 e = (class_1297)var33.next();
               if (e != null && e.method_5829() != null && e.method_5829().method_994(b) && e != mc.field_1724) {
                  this.Jack = true;
                  this.Harry = e;
                  "".length();
                  if ("  ".length() < -" ".length()) {
                     return null;
                  }
                  break label64;
               }

               "".length();
               if (-(119 ^ 15 ^ 101 ^ 25) > 0) {
                  return null;
               }
            }

            this.Jack = false;
            ++i;
            "".length();
            if (-" ".length() >= (116 ^ 112)) {
               return null;
            }
         }

         var35 = path;
         "".length();
         if (" ".length() <= 0) {
            return null;
         }
      } else {
         var35 = path;
         "".length();
         if ("  ".length() == "".length()) {
            return null;
         }
      }

      return var35;
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      this.Jacob = GL11.glGenLists(1);
      GL11.glNewList(this.Jacob, 4864);
      class_238 bb = new class_238(-0.5D, 0.0D, -0.5D, 0.5D, 1.0D, 0.5D);
      RenderUtils.drawSolidBox(bb);
      GL11.glEndList();
      "".length();
      if ("   ".length() >= "   ".length()) {
         ;
      }
   }

   public void Oliver(float partialTicks) {
      GL11.glPushMatrix();
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glEnable(2848);
      RenderUtils.setLineWidth(2.0F);
      GL11.glDisable(2896);
      RenderUtils.applyCameraRotationOnly();
      ArrayList<class_243> path = this.Jack(partialTicks);
      class_243 camPos = RenderUtils.getCameraPos();
      this.Oliver(path, camPos);
      if (!path.isEmpty()) {
         class_243 end = (class_243)path.get(path.size() - 1);
         this.Oliver(end, camPos, partialTicks);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      GL11.glDisable(2848);
      GL11.glPopMatrix();
      "".length();
      if (-"  ".length() <= 0) {
         ;
      }
   }

   private boolean Jack(class_1792 item) {
      byte var10000;
      if (!(item instanceof class_1753) && !(item instanceof class_1764) && !(item instanceof class_1823) && !(item instanceof class_1771) && !(item instanceof class_1776) && !(item instanceof class_1828) && !(item instanceof class_1803) && !(item instanceof class_1787) && !(item instanceof class_1835)) {
         var10000 = 0;
      } else {
         var10000 = 1;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      }

      byte var2 = var10000;
      "".length();
      return (boolean)(" ".length() <= 0 ? "".length() : var2);
   }

   public Trajectories() {
      super("Trajectories", "Draws a trajectory for the snowballs,\nender pearls, bows etc.", Category.Harry);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static int lIlIIlIIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(RenderListener.class, this);
      GL11.glDeleteLists(this.Jacob, 1);
      this.Jacob = 0;
      "".length();
      if (null == null) {
         ;
      }
   }
}
