package net.optifine.features.module.movement;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_243;
import net.minecraft.class_2828;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_2828.class_2830;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public final class NoFall extends Module implements PacketOutputListener, UpdateListener {
   // $FF: synthetic field
   private final EnumSetting< Mode> Jack;

   private static int lIIlIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      Timer.Jack = 1.0F;
      "".length();
      if (" ".length() < "  ".length()) {
         ;
      }
   }

   public NoFall() {
      super("NoFall", "Allows you to avoid fall damage.");
      this.Jack = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Oliver(Category.Jack);
      this.addSetting(this.Jack);
      "".length();
      if ((38 ^ 83 ^ 207 ^ 191) <= 0) {
         throw null;
      }
   }

   static {
      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   private static int lIIlIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Thomas() {
      Mode mode = ( Mode)this.Jack.Harry();
      switch(mode) {
      case Oliver:
         class_746 player = mc.field_1724;
         float var10000 = player.field_6017;
         byte var10001;
         if (player.method_6128()) {
            var10001 = 1;
            "".length();
            if ("  ".length() < -" ".length()) {
               return;
            }
         } else {
            var10001 = 2;
         }

         if (lIIlIlII(var10000, (float)var10001) <= 0) {
            "".length();
            if (" ".length() == "  ".length()) {
               return;
            }
            break;
         } else if (player.method_6128() && player.method_5715() && !this.Oliver(player)) {
            "".length();
            if ("   ".length() <= " ".length()) {
               return;
            }
            break;
         } else {
            player.field_3944.method_2883(new class_2828(true));
         }
      default:
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      }

   }

   private boolean Oliver(class_746 player) {
      byte var10000;
      if (lIIlIlIl(player.method_18798().field_1351, -0.5D) < 0) {
         var10000 = 1;
         "".length();
         if ("".length() == -" ".length()) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var2 = var10000;
      "".length();
      return (boolean)((129 + 41 - 35 + 11 ^ 88 + 100 - 83 + 45) < 0 ? "".length() : var2);
   }

   private static int lIIlIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jack.Harry());
      "".length();
      return "".length() > "  ".length() ? null : var1;
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() == null) {
         "".length();
         if ("".length() >= " ".length()) {
            return;
         }
      } else {
         class_746 player = mc.field_1724;
         if (player == null) {
            "".length();
            if (null != null) {
               return;
            }
         } else {
            Mode mode = ( Mode)this.Jack.Harry();
            double var10000;
            double var10001;
            class_243 vel;
            switch(mode) {
            case Jack:
               if (event.Jacob() instanceof class_2828) {
                  var10000 = (double)mc.field_1724.field_6017;
                  if (mc.field_1724.method_6128()) {
                     var10001 = 1.5D;
                     "".length();
                     if (-" ".length() != -" ".length()) {
                        return;
                     }
                  } else {
                     var10001 = 3.0D;
                  }

                  if (lIIlIllI(var10000, var10001) > 0) {
                     class_2828 pm = (class_2828)event.Jacob();
                     double y = pm.method_12268(player.method_23318());
                     event.Oliver(new class_2830(pm.method_12269(player.method_23317()), y - y % 0.015625D, pm.method_12274(player.method_23321()), player.method_5705(0.0F), player.method_5695(0.0F), true));
                     "".length();
                     if ((95 ^ 91) == 0) {
                        return;
                     }
                  }
               }
               break;
            case Charlie:
               if (event.Jacob() instanceof class_2828) {
                  vel = mc.field_1724.method_18798();
                  var10000 = (double)mc.field_1724.field_6017;
                  if (mc.field_1724.method_6128()) {
                     var10001 = 1.5D;
                     "".length();
                     if ((134 ^ 130) <= " ".length()) {
                        return;
                     }
                  } else {
                     var10001 = 3.0D;
                  }

                  if (lIIlIllI(var10000, var10001) > 0) {
                     mc.field_1724.field_3944.method_2872().method_10743(new class_2830(mc.field_1724.method_23317(), mc.field_1724.method_23318(), mc.field_1724.method_23321(), mc.field_1724.field_6031, mc.field_1724.field_5965, true));
                     mc.field_1724.method_18800(0.0D, vel.method_10214(), 0.0D);
                     Timer.Jack = 0.7F;
                     mc.field_1724.field_6017 = 0.0F;
                     "".length();
                     if ("".length() > 0) {
                        return;
                     }
                  } else {
                     Timer.Jack = 1.0F;
                  }

                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return;
                  }
               }
               break;
            case Jacob:
               if (event.Jacob() instanceof class_2828) {
                  vel = mc.field_1724.method_18798();
                  if (lIIlIllI((double)mc.field_1724.field_6017, 4.5D) > 0) {
                     mc.field_1724.field_3944.method_2872().method_10743(new class_2829(mc.field_1724.method_23317(), mc.field_1724.method_23318(), mc.field_1724.method_23321(), true));
                     mc.field_1724.method_18800(0.0D, vel.method_10214(), 0.0D);
                     mc.field_1724.field_6017 = 0.0F;
                     Timer.Jack = 2.0F;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     Timer.Jack = 1.0F;
                  }
               }
            }

            "".length();
            if (null != null) {
               return;
            }
         }
      }

   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if ("".length() >= -" ".length()) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      Oliver("Vanilla"),
      // $FF: synthetic field
      Jacob("Matrix 6.2.3"),
      // $FF: synthetic field
      Charlie("Matrix 6.1.1");

      // $FF: synthetic field
      private final String Thomas;
      // $FF: synthetic field
      Harry("SunRise"),
      // $FF: synthetic field
      Jack("Kauri");

      private Mode(String name) {
         this.Thomas = name;
         "".length();
         if ((9 ^ 30 ^ 142 ^ 157) != (50 ^ 20 ^ 170 ^ 136)) {
            throw null;
         }
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Thomas;
         "".length();
         return "   ".length() > "   ".length() ? null : var1;
      }

      public String toString() {
         String var1 = this.Thomas;
         "".length();
         return null != null ? null : var1;
      }

      static {
         "".length();
         if (-"  ".length() < 0) {
            ;
         }
      }
   }
}
