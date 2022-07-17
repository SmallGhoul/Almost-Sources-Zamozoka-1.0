package net.optifine.features.module.movement;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

import java.util.Objects;

public final class Speed extends Module implements UpdateListener {
   // $FF: synthetic field
   int Harry;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final EnumSetting< Mode> Jacob;
   // $FF: synthetic field
   private final BooleanSetting Charlie;

   public Speed() {
      super("Speed", "Allows you to move faster.");
      this.Jacob = new EnumSetting("Mode", Mode.values(), Mode.Jacob);
      this.Charlie = new BooleanSetting("Auto Jump", false);
      this.Jack = 0;
      this.Harry = 0;
      this.Oliver(Category.Jack);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      "".length();
      if ("   ".length() == 0) {
         throw null;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      if (this.Jacob.Harry() == Mode.Jack) {
         Global.Thomas().getNotificationManager().spawnNotification("Warning", "This mode is not infinite!");
      }

      if (this.Jacob.Harry() == Mode.George || this.Jacob.Harry() == Mode.Oscar) {
         Global.Thomas().getNotificationManager().spawnNotification("Warning", "This mode may flag!");
      }

      if (!this.Charlie.Jack()) {
         Global.Thomas().getNotificationManager().spawnNotification("Warning", "Some mods can work wrong without auto jump!");
      }

      "".length();
      if ((56 ^ 60) != "".length()) {
         ;
      }
   }

   private static int lllIIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int llIlllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private void George() {
      mc.field_1724.field_6281 = 0.0208F;
      if (mc.field_1724.method_24828() && this.Charlie.Jack()) {
         mc.field_1724.method_6043();
      }

      if (this.Harry++ == 0) {
         Timer.Jack = 2.51F;
         "".length();
         if ("   ".length() <= "  ".length()) {
            return;
         }
      } else if (this.Harry % 20 == 0) {
         Timer.Jack = 1.0F;
      }

      if (this.Harry >= 59) {
         this.Harry = 0;
      }

      "".length();
      if ("".length() == "".length()) {
         ;
      }
   }

   private static int llIllllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      Timer.Jack = 1.0F;
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (" ".length() == "   ".length()) {
            return;
         }
      } else {
         boolean ground = mc.field_1724.method_24828();
         if (ground) {
            this.Jack = 0;
            "".length();
            if (-" ".length() > 0) {
               return;
            }
         } else {
            ++this.Jack;
         }

         Mode mode = ( Mode)this.Jacob.Harry();
         mc.field_1724.field_6281 = 0.02F;
         class_243 motion;
         switch(mode) {
         case Oscar:
            this.George();
            this.Oscar();
            "".length();
            if ((22 ^ 18) <= 0) {
               return;
            }
            break;
         case Thomas:
            this.George();
            "".length();
            if (null != null) {
               return;
            }
            break;
         case George:
            this.Oscar();
            "".length();
            if ("  ".length() == 0) {
               return;
            }
            break;
         case Charlie:
            if (MovementUtils.isMoving()) {
               if (mc.field_1724.method_24828()) {
                  mc.field_1724.method_6043();
                  float var10000;
                  if (llIlllll(MovementUtils.getSpeed(), 0.55F) < 0) {
                     var10000 = MovementUtils.getSpeed() * 1.045F;
                     "".length();
                     if ("  ".length() >= "   ".length()) {
                        return;
                     }
                  } else {
                     var10000 = (float)(0.550000011920929D - Math.random() / 1000.0D);
                  }

                  float speed = var10000;
                  if (mc.field_1724.method_24828() && mc.field_1724.method_6059(class_1294.field_5904)) {
                     speed *= 1.0F + 0.13F * (float)(1 + ((class_1293)Objects.requireNonNull(mc.field_1724.method_6112(class_1294.field_5904))).method_5578());
                  }

                  MovementUtils.strafe(speed);
                  "".length();
                  if (null != null) {
                     return;
                  }

                  return;
               }

               if (lllIIIII(mc.field_1724.method_18798().method_10214(), 0.2D) < 0) {
                  MovementUtils.setMotionY(mc.field_1724.method_18798().method_10214() - 0.02D);
               }

               MovementUtils.strafe(MovementUtils.getSpeed() * 1.01885F);
               "".length();
               if ("  ".length() <= 0) {
                  return;
               }
            } else {
               MovementUtils.strafe(0.0F);
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }
            break;
         case Harry:
            mc.field_1724.field_6281 = 0.0223F;
            if (mc.field_1724.method_24828()) {
               if (this.Charlie.Jack()) {
                  mc.field_1724.method_6043();
               }

               Timer.Jack = 1.075F;
               "".length();
               if (-(81 + 59 - 96 + 99 ^ 13 + 61 - -12 + 53) >= 0) {
                  return;
               }
            } else {
               MovementUtils.strafe();
            }

            switch(this.Jack) {
            case 1:
            case 2:
               Timer.Jack = 0.9F;
               "".length();
               if (null != null) {
                  return;
               }
               break;
            case 3:
               Timer.Jack = 1.05F;
               "".length();
               if ("   ".length() == 0) {
                  return;
               }
               break;
            case 4:
               Timer.Jack = 0.85F;
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
               break;
            case 5:
               Timer.Jack = 0.8F;
            }

            if (lllIIIII(mc.field_1724.method_18798().field_1351, 0.0D) < 0) {
               if (llIlllll(Timer.Jack, 1.0F) < 0) {
                  Timer.Jack = 1.45F;
                  "".length();
                  if (-(133 + 141 - 239 + 157 ^ 93 + 73 - 142 + 172) > 0) {
                     return;
                  }
               } else {
                  Timer.Jack += -0.05F;
                  "".length();
                  if ("  ".length() < "".length()) {
                     return;
                  }
               }
            }
            break;
         case Oliver:
            if (mc.field_1724.method_24828()) {
               if (this.Charlie.Jack()) {
                  mc.field_1724.method_6043();
               }

               Timer.Jack = 0.94F;
            }

            if (lllIIIIl((double)mc.field_1724.field_6017, 0.7D) > 0 && lllIIIII((double)mc.field_1724.field_6017, 1.3D) < 0) {
               mc.field_1724.field_6281 = 0.02F;
               Timer.Jack = 3.0F;
               "".length();
               if ("".length() != 0) {
                  return;
               }
            } else {
               mc.field_1724.field_6281 = 0.0201F;
               "".length();
               if ((27 + 147 - 25 + 13 ^ 97 + 109 - 106 + 67) == 0) {
                  return;
               }
            }
            break;
         case Jacob:
            motion = mc.field_1724.method_18798();
            if (!ground) {
               if (lllIIIIl(motion.field_1351, 0.0D) > 0) {
                  mc.field_1724.field_6281 = 0.0245F;
                  motion = new class_243(motion.field_1352, motion.field_1351 - 0.0028D, motion.field_1350);
                  Timer.Jack = 1.25F;
                  "".length();
                  if ("".length() != 0) {
                     return;
                  }
               } else {
                  mc.field_1724.field_6281 = 0.0285F;
                  motion = new class_243(motion.field_1352, motion.field_1351 - 0.0038D, motion.field_1350);
                  Timer.Jack = 1.0F;
                  "".length();
                  if ("  ".length() >= (163 ^ 167)) {
                     return;
                  }
               }
            } else {
               Timer.Jack = 1.0F;
            }

            if (lllIIIIl((double)mc.field_1724.field_6017, 0.5D) > 0 && lllIIIII((double)mc.field_1724.field_6017, 1.5D) < 0) {
               motion = new class_243(motion.field_1352, -1.0D, motion.field_1350);
               Timer.Jack = 1.5F;
               mc.field_1724.field_6281 = 0.0285F;
            }

            if (ground && MovementUtils.isMoving()) {
               if (this.Charlie.Jack()) {
                  mc.field_1724.method_6043();
               }

               MovementUtils.strafe(0.485F);
               "".length();
               if (" ".length() < -" ".length()) {
                  return;
               }
            } else {
               mc.field_1724.method_18799(motion);
            }

            MovementUtils.strafe();
            "".length();
            if (-(23 ^ 19) > 0) {
               return;
            }
            break;
         case Jack:
            if (ground) {
               Timer.Jack = 1.0F;
            }

            motion = mc.field_1724.method_18798();
            if (lllIIIIl(motion.method_10214(), 0.0D) > 0 && !ground) {
               motion = new class_243(motion.field_1352, motion.field_1351 - 7.991E-4D, motion.field_1350);
               mc.field_1724.field_6281 = 0.0201465F;
               Timer.Jack = 1.8F;
               "".length();
               if ("".length() < 0) {
                  return;
               }
            } else {
               motion = new class_243(motion.field_1352, motion.field_1351 - 7.4775E-4D, motion.field_1350);
               mc.field_1724.field_6281 = 0.0201519F;
               Timer.Jack = 0.82F;
            }

            if (lllIIIIl((double)mc.field_1724.field_6017, 0.5D) > 0) {
               Timer.Jack = 3.0F;
            }

            if (lllIIIIl((double)mc.field_1724.field_6017, 1.5D) > 0) {
               Timer.Jack = 1.0F;
            }

            mc.field_1724.method_18799(motion);
            if (ground && MovementUtils.isMoving() && this.Charlie.Jack()) {
               mc.field_1724.method_6043();
            }
         }

         if (mc.field_1724.method_5624()) {
            class_746 var5 = mc.field_1724;
            var5.field_6281 *= 1.3F;
         }

         "".length();
         if ("".length() != 0) {
            return;
         }
      }

   }

   private static int lllIIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public String Oliver() {
      String var1 = (( Mode)this.Jacob.Harry()).Oliver();
      "".length();
      return "   ".length() <= "  ".length() ? null : var1;
   }

   static {
      "".length();
      if ("  ".length() != (2 ^ 87 ^ 65 ^ 16)) {
         ;
      }
   }

   private void Oscar() {
      if (!MovementUtils.isMoving()) {
         "".length();
         if ("   ".length() <= -" ".length()) {
            return;
         }
      } else {
         class_243 motion = mc.field_1724.method_18798();
         double motionY = motion.field_1351;
         if (this.Jack == 2 && llIllllI(motion.field_1351, 0.0D) > 0) {
            double origLen = Math.hypot(motion.field_1352, motion.field_1350);
            double amt = Math.min((1.0D - origLen) * 2.95D, 1.9D);
            motion = new class_243(motion.field_1352 * amt, motion.field_1351, motion.field_1350 * amt);
            double len = Math.hypot(motion.field_1352, motion.field_1350);
            double lenClamped = Math.min(len, 0.7D);
            mc.field_1724.method_18800(motion.field_1352 / len * lenClamped, motionY, motion.field_1350 / len * lenClamped);
            "".length();
            if (" ".length() != " ".length()) {
               return;
            }
         } else if (this.Jack == 0 && this.Charlie.Jack()) {
            mc.field_1724.method_6043();
         }

         "".length();
         if (-" ".length() > 0) {
            return;
         }
      }

   }

   private static enum Mode {
      // $FF: synthetic field
      Oliver("AAC4");

      // $FF: synthetic field
      private final String James;
      // $FF: synthetic field
      Jacob("NCPT"),
      // $FF: synthetic field
      Jack("AAC5"),
      // $FF: synthetic field
      George("Matrix6.1"),
      // $FF: synthetic field
      Thomas("MatrixT"),
      // $FF: synthetic field
      Oscar("Matrix6.1T"),
      // $FF: synthetic field
      Harry("NCP"),
      // $FF: synthetic field
      Charlie("Watchdog");

      public String toString() {
         String var1 = this.James;
         "".length();
         return -" ".length() >= 0 ? null : var1;
      }

      static {
         "".length();
         if ("".length() == 0) {
            ;
         }
      }

      private Mode(String name) {
         this.James = name;
         "".length();
         if ("  ".length() >= (18 ^ 47 ^ 72 ^ 113)) {
            throw null;
         }
      }

      public String Oliver() {
         String var1 = this.James;
         "".length();
         return " ".length() == 0 ? null : var1;
      }
   }
}
