package net.optifine.features.module.movement;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public class LongJump extends Module implements UpdateListener {
   // $FF: synthetic field
   private final BooleanSetting Charlie;
   // $FF: synthetic field
   boolean Jack;
   // $FF: synthetic field
   int Harry;
   // $FF: synthetic field
   private final EnumSetting< Mode> Jacob;

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      mc.field_1724.method_18800(mc.field_1724.method_18798().method_10216() / 6.0D, mc.field_1724.method_18798().method_10214() / 6.0D, mc.field_1724.method_18798().method_10215() / 6.0D);
      Timer.Jack = 1.0F;
      "".length();
      if (null == null) {
         ;
      }
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jacob.Harry());
      "".length();
      return null != null ? null : var1;
   }

   public LongJump() {
      super("LongJump");
      this.Jacob = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Charlie = new BooleanSetting("Auto Disable", true);
      this.Jack = false;
      this.Harry = 0;
      this.Oliver(Category.Jack);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if ("  ".length() >= "   ".length()) {
         throw null;
      }
   }

   static {
      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if ("   ".length() == 0) {
            return;
         }
      } else if (this.Jack && this.Charlie.Jack() && mc.field_1724.method_24828()) {
         this.Jack = false;
         this.Oliver(false);
         "".length();
         if (null != null) {
            return;
         }
      } else {
         class_746 player = mc.field_1724;
         Timer.Jack = 1.0F;
         switch(( Mode)this.Jacob.Harry()) {
         case Oliver:
            if (player.method_24828()) {
               player.method_23327(player.method_23317(), (double)Math.round(player.method_23318()), player.method_23321());
               player.method_18800(player.method_18798().field_1352, 0.6000000238418579D, player.method_18798().field_1350);
               this.Jack = true;
            }

            MovementUtils.strafe(1.5F + (float)(this.Harry % 11) / 11.0F);
            "".length();
            if ((168 ^ 172) > (70 ^ 66)) {
               return;
            }
            break;
         case Jack:
            if (player.method_24828()) {
               player.method_6043();
               this.Jack = true;
               "".length();
               if (-" ".length() >= (32 ^ 74 ^ 69 ^ 43)) {
                  return;
               }
            } else {
               float var10002;
               if (player.method_5624()) {
                  var10002 = 1.3F;
                  "".length();
                  if (-" ".length() > "".length()) {
                     return;
                  }
               } else {
                  var10002 = 1.0F;
               }

               player.field_6281 = 0.07837456F * var10002;
               Timer.Jack = 0.5F;
            }
         }

         "".length();
         if (null != null) {
            return;
         }
      }

   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.Harry = 0;
      this.Jack = false;
      "".length();
      if ("  ".length() != " ".length()) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      private final String Harry;
      // $FF: synthetic field
      Jack("AAC4"),
      // $FF: synthetic field
      Oliver("MegaCraft");

      static {
         "".length();
         if ("".length() == 0) {
            ;
         }
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Harry;
         "".length();
         return " ".length() <= "".length() ? null : var1;
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "".length() != 0 ? null : var1;
      }

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if ("".length() != 0) {
            throw null;
         }
      }
   }
}
