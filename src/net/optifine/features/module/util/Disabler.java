package net.optifine.features.module.util;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.PacketInputListener;
import net.optifine.managers.event.events.PacketInputListener.PacketInputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.ChatUtils;
import net.minecraft.*;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_2848.class_2849;
import net.minecraft.class_2856.class_2857;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class Disabler extends Module implements PacketInputListener, UpdateListener {
   // $FF: synthetic field
   private final EnumSetting< Mode> Harry;
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final NumberSetting Jacob;
   // $FF: synthetic field
   private final BooleanSetting Charlie;
   // $FF: synthetic field
   int Jack;

   private static int lllIIlIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         ++this.Jack;
         switch(( Mode)this.Harry.Harry()) {
         case Harry:
            mc.field_1724.field_3944.method_2872().method_10743(new class_2884(mc.field_1724.method_5667()));
            mc.field_1724.field_3944.method_2872().method_10743(new class_2851(0.98F, 0.98F, false, false));
            "".length();
            if (-" ".length() >= "  ".length()) {
               return;
            }
            break;
         case Jacob:
            mc.field_1724.field_3944.method_2872().method_10743(new class_2856(class_2857.field_13017));
            "".length();
            if ("   ".length() == (67 ^ 7 ^ 227 ^ 163)) {
               return;
            }
            break;
         case Jack:
            if (this.Jack % this.Jacob.Oscar() == 0) {
               class_2535 var10000 = mc.field_1724.field_3944.method_2872();
               class_2829 var10001 = new class_2829;
               double var10003 = mc.field_1724.method_23317();
               double var10004;
               if (lllIIlIll(Math.random(), 0.5D) > 0) {
                  var10004 = 69420.0D;
                  "".length();
                  if ("".length() >= (14 + 40 - 9 + 128 ^ 0 + 8 - -113 + 48)) {
                     return;
                  }
               } else {
                  var10004 = 42069.0D;
               }

               double var10005;
               if (this.Charlie.Jack()) {
                  var10005 = -1.0D;
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
               } else {
                  var10005 = 1.0D;
               }

               var10001.<init>(var10003, var10004 * var10005, mc.field_1724.method_23321(), this.Thomas.Jack());
               var10000.method_10743(var10001);
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }
            break;
         case Thomas:
            mc.field_1724.field_3944.method_2872().method_10743(new class_2851(1.0F, 1.0F, false, false));
            "".length();
            if (null != null) {
               return;
            }
            break;
         case Oliver:
            mc.field_1724.field_3944.method_2872().method_10743(new class_2809(0, (short)0, true));
            "".length();
            if (-" ".length() > 0) {
               return;
            }
            break;
         case Charlie:
            if (this.Jack % 3 == 0) {
               mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12982));
            }
         }

         "".length();
         if (null != null) {
            return;
         }
      }

   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Harry.Harry());
      "".length();
      return " ".length() != " ".length() ? null : var1;
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PacketInputListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      if (this.Harry.Harry() == Mode.Harry) {
         ChatUtils.message("Verus is disabled for 80%-90%");
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   static {
      "".length();
      if ((186 ^ 190) > 0) {
         ;
      }
   }

   public Disabler() {
      super("Disabler", "Disables some shitty anticheats :p", Category.Charlie);
      this.Harry = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Jacob = new NumberSetting("Void Ticks", 3.0D, 1.0D, 15.0D, 1.0D, ValueDisplay.Jack);
      this.Charlie = new BooleanSetting("Is Void", true);
      this.Thomas = new BooleanSetting("Void Ground Spoof", true);
      this.Jack = 0;
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      "".length();
      if (-" ".length() >= "".length()) {
         throw null;
      }
   }

   public void Oliver(PacketInputEvent event) {
      if (mc.field_1724 == null) {
         "".length();
         if (" ".length() > (152 ^ 156)) {
            return;
         }
      } else {
         Mode mode = ( Mode)this.Harry.Harry();
         class_2596<?> packet = event.Jacob();
         switch(mode) {
         case Harry:
            if (packet instanceof class_2809) {
               event.Oliver();
            }
         default:
            "".length();
            if (null != null) {
               return;
            }
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(PacketInputListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (-(23 ^ 102 ^ 123 ^ 14) < 0) {
         ;
      }
   }

   private static enum Mode {
      // $FF: synthetic field
      private final String George;
      // $FF: synthetic field
      Jacob("PineCone"),
      // $FF: synthetic field
      Harry("Verus"),
      // $FF: synthetic field
      Charlie("Matrix"),
      // $FF: synthetic field
      Thomas("Artemis"),
      // $FF: synthetic field
      Oliver("Kauri"),
      // $FF: synthetic field
      Jack("VoidTP");

      static {
         "".length();
         if (" ".length() != "   ".length()) {
            ;
         }
      }

      private Mode(String name) {
         this.George = name;
         "".length();
         if ((171 ^ 175) < 0) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.George;
         "".length();
         return "".length() == "   ".length() ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.George;
         "".length();
         return "  ".length() <= "".length() ? null : var1;
      }
   }
}
