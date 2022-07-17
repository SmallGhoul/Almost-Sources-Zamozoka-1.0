package net.optifine.features.module.custom;

import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.minecraft.class_243;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class CustomPortSpeed extends Module implements UpdateListener {
   // $FF: synthetic field
   private int William;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   private final BooleanSetting James;
   // $FF: synthetic field
   private final BooleanSetting Harry = new BooleanSetting("Auto Sprint", true);
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   private final NumberSetting Thomas;
   // $FF: synthetic field
   private final BooleanSetting Jack = new BooleanSetting("Auto Jump", true);
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final NumberSetting Jacob;

   public CustomPortSpeed() {
      super("CustomPortSpeed", "Allows to create your configuration of port speed.\nPort speed is trying to touch ground as often as possible to make the player faster.", Category.George);
      this.Jacob = new NumberSetting("Tick For Y-Motion", 5.0D, 1.0D, 20.0D, 1.0D, ValueDisplay.Jack);
      this.Charlie = new NumberSetting("Custom Y-Motion", -1.0D, -1.0D, 0.0D, 0.005D);
      this.Thomas = new NumberSetting("Speed", 0.30000001192092896D, 0.0D, 1.0D, 0.005D);
      this.George = new BooleanSetting("Only Glide Speed", true);
      this.Oscar = new BooleanSetting("Only On Tick", true);
      this.James = new BooleanSetting("Ground Speed Reset", true);
      this.William = 0;
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      "".length();
      if ("".length() < 0) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int lIIIIlIIIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   static {
      "".length();
      if ("  ".length() != 0) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         if (mc.field_1724.method_24828()) {
            this.William = 0;
            "".length();
            if (-(161 ^ 164) >= 0) {
               return;
            }
         } else {
            ++this.William;
         }

         if (this.Harry.Jack()) {
            mc.field_1724.method_5728(true);
         }

         if (lIIIIlIIIII(this.Thomas.George(), 0.0F) != 0 && !this.George.Jack()) {
            MovementUtils.strafe(this.Thomas.George());
         }

         if (mc.field_1724.method_24828()) {
            if (this.James.Jack()) {
               MovementUtils.strafe(0.2873F);
            }

            if (this.Jack.Jack()) {
               mc.field_1724.method_6043();
            }
         }

         boolean var10000;
         if (this.Oscar.Jack()) {
            if (this.William == this.Jacob.Oscar()) {
               var10000 = true;
               "".length();
               if ("".length() != 0) {
                  return;
               }
            } else {
               var10000 = false;
               "".length();
               if ((215 ^ 189 ^ 245 ^ 155) <= "   ".length()) {
                  return;
               }
            }
         } else if (this.William >= this.Jacob.Oscar()) {
            var10000 = true;
            "".length();
            if (-" ".length() > "  ".length()) {
               return;
            }
         } else {
            var10000 = false;
         }

         boolean condition = var10000;
         if (condition) {
            class_243 vec3d = mc.field_1724.method_18798();
            mc.field_1724.method_18799(new class_243(vec3d.field_1352, (double)this.Charlie.George() + Math.random() * 1.0E-12D, vec3d.field_1350));
            if (lIIIIlIIIII(this.Thomas.George(), 0.0F) != 0 && this.George.Jack()) {
               MovementUtils.strafe((float)((double)this.Thomas.George() + Math.random() * 1.0E-12D));
            }
         }

         "".length();
         if ("  ".length() == " ".length()) {
            return;
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (" ".length() <= "  ".length()) {
         ;
      }
   }
}
