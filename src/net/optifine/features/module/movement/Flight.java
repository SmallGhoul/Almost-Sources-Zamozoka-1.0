package net.optifine.features.module.movement;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.config.Splitter;
import net.optifine.managers.event.events.IsPlayerInWaterListener;
import net.optifine.managers.event.events.IsPlayerInWaterListener.IsPlayerInWaterEvent;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.MovementUtils;
import net.optifine.util.PacketUtil.FlyingC03Packet;
import net.minecraft.*;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_2848.class_2849;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public final class Flight extends Module implements UpdateListener, IsPlayerInWaterListener, PacketOutputListener {
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   private final EnumSetting< Mode> Jacob;
   // $FF: synthetic field
   private final NumberSetting Thomas;
   // $FF: synthetic field
   int Harry;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   private final NumberSetting Oscar;
   // $FF: synthetic field
   private int James;

   public void onSentPacket(PacketOutputEvent event) {
      class_2596<?> packet = event.Jacob();
      switch(( Mode)this.Jacob.Harry()) {
      case William:
         if (packet instanceof class_2828) {
            FlyingC03Packet flyingC03Packet = new FlyingC03Packet((class_2828)packet);
            flyingC03Packet.y -= flyingC03Packet.y % 0.0625D;
            flyingC03Packet.onGround = true;
            event.Oliver(flyingC03Packet.toPacket());
         }
      default:
         "".length();
         if (null == null) {
            ;
         }
      }
   }

   static {
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(IsPlayerInWaterListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      this.James = 0;
      this.Jack = 10;
      if (this.Jacob.Harry() == Mode.George || this.Jacob.Harry() == Mode.Oscar) {
         Global.Thomas().getNotificationManager().spawnNotification("Warning!", "This mode is not infinite!");
      }

      this.Harry = 0;
      "".length();
      if ((108 ^ 15 ^ 203 ^ 172) > 0) {
         ;
      }
   }

   public void Oliver(IsPlayerInWaterEvent event) {
      event.Oliver(false);
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Thomas() {
      class_746 player = mc.field_1724;
      float var10002;
      switch(( Mode)this.Jacob.Harry()) {
      case Oliver:
         player.field_7503.field_7479 = false;
         player.field_6281 = this.Charlie.George();
         player.method_18800(0.0D, 0.0D, 0.0D);
         class_243 velcity = player.method_18798();
         if (mc.field_1690.field_1903.method_1434()) {
            player.method_18799(velcity.method_1031(0.0D, (double)this.Charlie.George(), 0.0D));
         }

         if (mc.field_1690.field_1832.method_1434()) {
            player.method_18799(velcity.method_1023(0.0D, (double)this.Charlie.George(), 0.0D));
            "".length();
            if ("   ".length() <= "".length()) {
               return;
            }
         }
         break;
      case Jack:
         player.field_7503.field_7479 = true;
         "".length();
         if ("".length() != "".length()) {
            return;
         }
         break;
      case Jacob:
         player.field_7503.field_7479 = false;
         if (mc.field_1724.method_24828()) {
            player.method_18800(player.method_18798().field_1352, 0.42D, player.method_18798().field_1350);
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }
         } else {
            MovementUtils.strafe(4.0F);
            player.method_18800(player.method_18798().field_1352, -0.003000000026077032D, player.method_18798().field_1350);
            "".length();
            if (null != null) {
               return;
            }
         }
         break;
      case Charlie:
         player.field_7503.field_7479 = false;
         if (this.James++ % 7 == 0) {
            player.method_18800(player.method_18798().field_1352, -0.003759999992325902D, player.method_18798().field_1350);
            Timer.Jack = 0.2F;
            player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318(), player.method_23321(), false));
            "".length();
            if ("   ".length() <= "".length()) {
               return;
            }
         } else {
            Timer.Jack = 1.0F;
            "".length();
            if (" ".length() < 0) {
               return;
            }
         }
         break;
      case William:
         MovementUtils.strafe(0.25F);
         class_243 velocity = mc.field_1724.method_18798();
         mc.field_1724.method_18800(velocity.field_1352, 0.0D, velocity.field_1350);
         "".length();
         if ("  ".length() != "  ".length()) {
            return;
         }
         break;
      case Harry:
         player.field_7503.field_7479 = false;
         mc.field_1724.method_18800(mc.field_1724.method_18798().field_1352, 0.0D, mc.field_1724.method_18798().field_1350);
         if (this.James++ % this.Thomas.Oscar() == 0) {
            if (this.George.Jack()) {
               player.method_6043();
            }

            if (llllIIllII((double)this.Oscar.George(), 0.5D) < 0) {
               player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318() - (double)this.Oscar.George(), player.method_23321(), true));
               "".length();
               if ("".length() >= "   ".length()) {
                  return;
               }
            } else {
               player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318() + (double)this.Oscar.George(), player.method_23321(), true));
               "".length();
               if (null != null) {
                  return;
               }
            }
         }
         break;
      case George:
         player.method_18800(player.method_18798().field_1352, -0.07840000092983246D, player.method_18798().field_1350);
         "".length();
         if ("  ".length() <= " ".length()) {
            return;
         }
         break;
      case Thomas:
         if (mc.field_1724.field_6012 % 2 == 0) {
            player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318(), player.method_23321(), true));
            int i = 0;

            while(i < 2) {
               player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318() + 2000.0D, player.method_23321(), false));
               player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318() - 2000.0D, player.method_23321(), false));
               ++i;
               "".length();
               if ((96 ^ 100) <= " ".length()) {
                  return;
               }
            }

            player.field_3944.method_2883(new class_2829(player.method_23317(), player.method_23318() + 0.2D, player.method_23321(), true));
            "".length();
            if ("".length() == "   ".length()) {
               return;
            }
         } else {
            player.method_18800(player.method_18798().field_1352, 0.0D, player.method_18798().field_1350);
            MovementUtils.strafe(9.0F);
            Timer.Jack = 0.5F;
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         }
         break;
      case Oscar:
         if (this.James++ % 3 == 0) {
            mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12982));
         }

         if (this.James++ % 7 == 0) {
            if (player.method_5624()) {
               var10002 = 1.3F;
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               var10002 = 1.0F;
            }

            player.field_6281 = 0.19837455F * var10002;
            Timer.Jack = 4.0F;
            "".length();
            if (null != null) {
               return;
            }
         } else {
            Timer.Jack = 1.0F;
         }

         if (mc.field_1690.field_1903.method_1434()) {
            player.method_18800(player.method_18798().field_1352, 0.07D, player.method_18798().field_1350);
            "".length();
            if ("".length() < -" ".length()) {
               return;
            }
         }
         break;
      case James:
         if (this.James++ % 5 == 0) {
            if (player.method_5624()) {
               var10002 = 1.3F;
               "".length();
               if (-" ".length() != -" ".length()) {
                  return;
               }
            } else {
               var10002 = 1.0F;
            }

            player.field_6281 = 0.19837455F * var10002;
            mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12982));
         }

         if (mc.field_1690.field_1903.method_1434()) {
            player.method_18800(player.method_18798().field_1352, 1.06D, player.method_18798().field_1350);
         }
      }

      ++this.Jack;
      "".length();
      if (-(133 ^ 145 ^ 188 ^ 172) <= 0) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(IsPlayerInWaterListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      if (mc.field_1724 != null) {
         mc.field_1724.field_7503.field_7479 = false;
      }

      Timer.Jack = 1.0F;
      "".length();
      if ("   ".length() >= -" ".length()) {
         ;
      }
   }

   private static int llllIIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public Flight() {
      super("Flight", "Allows you to fly in survival mode.");
      this.Jacob = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Charlie = new NumberSetting("Flight Speed", 0.30000001192092896D, 0.05000000074505806D, 3.0D, 0.009999999776482582D, ValueDisplay.Oliver);
      this.Thomas = new NumberSetting("Ground Ticks", 3.0D, 1.0D, 12.0D, 0.009999999776482582D, ValueDisplay.Oliver);
      this.George = new BooleanSetting("Jump Boost", false);
      this.Oscar = new NumberSetting("Y Position", "GroundSpoof Y position\n", 0.25D, 0.0D, 1.0D, 0.01D);
      this.Jack = 0;
      this.Harry = 0;
      this.Oliver(Category.Jack);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(new Splitter("Ground Spoof Settings", "Spoof Options"));
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      "".length();
      if ((39 + 52 - -10 + 31 ^ 115 + 13 - 47 + 47) < " ".length()) {
         throw null;
      }
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jacob.Harry());
      "".length();
      return "".length() > 0 ? null : var1;
   }

   static enum Mode {
      // $FF: synthetic field
      Harry("Ground"),
      // $FF: synthetic field
      William("Verus");

      // $FF: synthetic field
      private final String Mary;
      // $FF: synthetic field
      Jacob("WellMore"),
      // $FF: synthetic field
      George("Minemora"),
      // $FF: synthetic field
      Oscar("LastCraft"),
      // $FF: synthetic field
      Oliver("Vanilla"),
      // $FF: synthetic field
      James("MST"),
      // $FF: synthetic field
      Charlie("Jartex-Glide"),
      // $FF: synthetic field
      Thomas("Redesky"),
      // $FF: synthetic field
      Jack("Creative");

      static {
         "".length();
         if ("  ".length() > -" ".length()) {
            ;
         }
      }

      public String toString() {
         String var1 = this.Mary;
         "".length();
         return -"   ".length() > 0 ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Mary;
         "".length();
         return " ".length() == "   ".length() ? null : var1;
      }

      private Mode(String name) {
         this.Mary = name;
         "".length();
         if (" ".length() < -" ".length()) {
            throw null;
         }
      }
   }
}
