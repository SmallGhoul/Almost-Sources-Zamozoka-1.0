package net.optifine.features.module.util;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.RotationUtils.Rotation;
import net.minecraft.class_1268;
import net.minecraft.class_304;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import org.apache.commons.lang3.RandomUtils;

public class AntiAFK extends Module implements UpdateListener {
   // $FF: synthetic field
   BooleanSetting Charlie = new BooleanSetting("Swing", true);
   // $FF: synthetic field
   BooleanSetting Jack = new BooleanSetting("Move", true);
   // $FF: synthetic field
   int Thomas = 0;
   // $FF: synthetic field
   int George = 0;
   // $FF: synthetic field
   BooleanSetting Harry = new BooleanSetting("Jump", true);
   // $FF: synthetic field
   BooleanSetting Jacob = new BooleanSetting("Rotation", true);

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      mc.field_1690.field_1894.method_23481(false);
      mc.field_1690.field_1913.method_23481(false);
      mc.field_1690.field_1849.method_23481(false);
      mc.field_1690.field_1881.method_23481(false);
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   static {
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   public AntiAFK() {
      super("AntiAFK", "Server will think what you are not AFK");
      this.Oliver(Category.Charlie);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if ("   ".length() < "  ".length()) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   private static int llllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Thomas() {
      ++this.Thomas;
      if (mc.field_1724 == null) {
         "".length();
         if ("   ".length() == -" ".length()) {
            return;
         }
      } else {
         if (this.Jacob.Jack()) {
            Rotation rot = new Rotation(mc.field_1724.field_6031 + RandomUtils.nextFloat(0.0F, 20.0F) - 10.0F, mc.field_1724.field_5965 + RandomUtils.nextFloat(0.0F, 6.0F) - 3.0F);
            Global.George().applyClient(rot.getYaw(), rot.getPitch());
         }

         if (this.Thomas % 20 == 0 && mc.field_1724.method_24828() && this.Harry.Jack()) {
            mc.field_1724.method_6043();
         }

         if (this.George == 0 && this.Charlie.Jack()) {
            mc.field_1724.method_6104(class_1268.field_5808);
         }

         if (this.Thomas % 30 == 0 && this.Jack.Jack()) {
            class_304 var10000 = mc.field_1690.field_1894;
            boolean var10001;
            if (llllIIl(Math.random(), 0.5D) > 0) {
               var10001 = true;
               "".length();
               if ((29 ^ 13 ^ 165 ^ 176) == 0) {
                  return;
               }
            } else {
               var10001 = false;
            }

            var10000.method_23481(var10001);
            var10000 = mc.field_1690.field_1913;
            if (llllIIl(Math.random(), 0.5D) > 0) {
               var10001 = true;
               "".length();
               if ("".length() != 0) {
                  return;
               }
            } else {
               var10001 = false;
            }

            var10000.method_23481(var10001);
            var10000 = mc.field_1690.field_1849;
            if (llllIIl(Math.random(), 0.5D) > 0) {
               var10001 = true;
               "".length();
               if ("   ".length() == "".length()) {
                  return;
               }
            } else {
               var10001 = false;
            }

            var10000.method_23481(var10001);
            var10000 = mc.field_1690.field_1881;
            if (llllIIl(Math.random(), 0.5D) > 0) {
               var10001 = true;
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
            } else {
               var10001 = false;
            }

            var10000.method_23481(var10001);
         }

         if (this.George == 0) {
            this.George = RandomUtils.nextInt(40, 80);
         }

         --this.George;
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      }

   }
}
