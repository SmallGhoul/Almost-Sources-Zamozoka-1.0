package net.optifine.features.module.movement;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.BlockUtils;
import net.optifine.util.ChatUtils;
import net.minecraft.*;
import net.minecraft.class_2828.class_2829;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.ArrayDeque;

public class AntiVoid extends Module implements PacketOutputListener, UpdateListener {
   // $FF: synthetic field
   double Jack;
   // $FF: synthetic field
   private final ArrayDeque<class_2596<?>> William;
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final NumberSetting James;
   // $FF: synthetic field
   double Jacob;
   // $FF: synthetic field
   double Harry;
   // $FF: synthetic field
   class_243 Charlie;
   // $FF: synthetic field
   boolean Thomas;
   // $FF: synthetic field
   private final EnumSetting< Mode> George;

   public AntiVoid() {
      super("AntiVoid", "Teleports you on last ground if you are falling too long.", Category.Jack);
      this.George = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Oscar = new BooleanSetting("Is Void Large Move", true);
      this.James = new NumberSetting("Fall Distance", 3.0D, 1.0D, 15.0D, 0.10000000149011612D, ValueDisplay.Oliver);
      this.William = new ArrayDeque();
      this.Jack = -69.0D;
      this.Harry = -69.0D;
      this.Jacob = -69.0D;
      this.Charlie = new class_243(-69.0D, -69.0D, -69.0D);
      this.Thomas = false;
      this.addSetting(this.George);
      this.addSetting(this.James);
      "".length();
      if (" ".length() >= "   ".length()) {
         throw null;
      }
   }

   private static int lIIIIllIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIllIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      this.William.forEach((p) -> {
         mc.field_1724.field_3944.method_2883(p);
         "".length();
         if ("  ".length() >= "".length()) {
            ;
         }
      });
      this.William.clear();
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if ("   ".length() > (211 ^ 179 ^ 46 ^ 74)) {
            return;
         }
      } else {
         Mode mode = ( Mode)this.George.Harry();
         if (lIIIIllIIlI(mc.field_1724.field_6017, this.James.George()) > 0) {
            if (mode == Mode.Oliver) {
               if (this.George()) {
                  mc.field_1724.method_18800(mc.field_1724.method_18798().field_1352, -0.125D, mc.field_1724.method_18798().field_1350);
                  "".length();
                  if ("  ".length() == "".length()) {
                     return;
                  }
               } else {
                  this.Jack = mc.field_1724.method_23317();
                  this.Harry = mc.field_1724.method_23318();
                  this.Jacob = mc.field_1724.method_23321();
                  this.Charlie = mc.field_1724.method_18798();
                  "".length();
                  if ((175 ^ 171) != (127 ^ 123)) {
                     return;
                  }
               }
            } else if (this.George()) {
               if (mc.field_1724.field_6012 == 0) {
                  class_2535 var10000 = mc.field_1724.field_3944.method_2872();
                  class_2829 var10001 = new class_2829;
                  double var10003 = mc.field_1724.method_23317();
                  double var10004;
                  if (lIIIIllIIll(Math.random(), 0.5D) > 0) {
                     var10004 = 69420.0D;
                     "".length();
                     if ("".length() != 0) {
                        return;
                     }
                  } else {
                     var10004 = 42069.0D;
                  }

                  double var10005;
                  if (this.Oscar.Jack()) {
                     var10005 = -1.0D;
                     "".length();
                     if ((35 ^ 39) < 0) {
                        return;
                     }
                  } else {
                     var10005 = 1.0D;
                  }

                  var10001.<init>(var10003, var10004 * var10005, mc.field_1724.method_23321(), true);
                  var10000.method_10743(var10001);
                  "".length();
                  if (" ".length() != " ".length()) {
                     return;
                  }
               }
            } else {
               this.Jack = mc.field_1724.method_23317();
               this.Harry = mc.field_1724.method_23318();
               this.Jacob = mc.field_1724.method_23321();
               this.Charlie = mc.field_1724.method_18798();
            }
         }

         this.Thomas = mc.field_1724.method_24828();
         "".length();
         if ("".length() < -" ".length()) {
            return;
         }
      }

   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.George.Harry());
      "".length();
      return " ".length() <= 0 ? null : var1;
   }

   public void onSentPacket(PacketOutputEvent event) {
      Mode mode = ( Mode)this.George.Harry();
      if (event.Jacob() instanceof class_2708) {
         ChatUtils.message("Resetted");
         this.Jack = -69.0D;
      }

      "".length();
      if ("   ".length() != "".length()) {
         ;
      }
   }

   static {
      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   public boolean George() {
      int yOffset = 0;
      class_243 pos = mc.field_1724.method_19538();

      boolean var3;
      while(true) {
         if (lIIIIllIIIl(pos.field_1351 + (double)yOffset, 0.0D) <= 0) {
            var3 = true;
            "".length();
            if ("   ".length() <= 0) {
               return (boolean)"".length();
            }
            break;
         }

         if (BlockUtils.getState(new class_2338(pos.method_1031(0.0D, (double)yOffset, 0.0D))).method_26207().method_15799()) {
            var3 = false;
            "".length();
            if ((173 ^ 169) == 0) {
               return (boolean)"".length();
            }
            break;
         }

         --yOffset;
         "".length();
         if ("  ".length() < 0) {
            return (boolean)"".length();
         }
      }

      return var3;
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      "".length();
      if (-(195 ^ 198) < 0) {
         ;
      }
   }

   private static int lIIIIllIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static enum Mode {
      // $FF: synthetic field
      Oliver("Basic"),
      // $FF: synthetic field
      Jack("LargeMove");

      // $FF: synthetic field
      private final String Harry;

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return (36 ^ 32) == " ".length() ? null : var1;
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Harry;
         "".length();
         return (23 ^ 54 ^ 188 ^ 152) <= 0 ? null : var1;
      }

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if ((136 ^ 148 ^ 178 ^ 170) <= 0) {
            throw null;
         }
      }
   }
}
