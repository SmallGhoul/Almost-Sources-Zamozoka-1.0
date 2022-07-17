package net.optifine.features.module.util;

import net.optifine.config.EnumSetting;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.BlockUtils;
import net.minecraft.class_2338;
import net.minecraft.class_3614;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class Eagle extends Module implements UpdateListener {
   // $FF: synthetic field
   EnumSetting< Mode> Jack;
   // $FF: synthetic field
   EnumSetting< HelpType> Harry;

   private static int lIIIIlIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public Eagle() {
      super("BridgeHelper", "");
      this.Jack = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.Harry = new EnumSetting("Help Type", HelpType.values(), HelpType.Oliver);
      this.Oliver(Category.Charlie);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   private static int lIIIIlIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      mc.field_1690.field_1832.method_23481(false);
      "".length();
      if ("   ".length() > -" ".length()) {
         ;
      }
   }

   static {
      "".length();
      if (-" ".length() <= 0) {
         ;
      }
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      } else {
         boolean air = false;
         boolean var10000;
         if (this.Jack.Harry() == Mode.Oliver) {
            if (BlockUtils.getState(new class_2338(mc.field_1724.method_23317(), mc.field_1724.method_23318() - 1.0D, mc.field_1724.method_23321())).method_26207() == class_3614.field_15959) {
               var10000 = true;
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               var10000 = false;
            }

            air = var10000;
            "".length();
            if (-" ".length() > (18 + 162 - 94 + 96 ^ 65 + 29 - -84 + 0)) {
               return;
            }
         } else {
            double x = Math.abs(mc.field_1724.method_23317() - (double)((int)mc.field_1724.method_23317()));
            double z = Math.abs(mc.field_1724.method_23317() - (double)((int)mc.field_1724.method_23321()));
            if (lIIIIlIIIl(x, 0.7D) <= 0 && lIIIIlIIlI(x, 0.3D) >= 0 && lIIIIlIIIl(z, 0.7D) <= 0 && lIIIIlIIlI(z, 0.3D) >= 0) {
               var10000 = false;
            } else {
               var10000 = true;
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }

            air = var10000;
         }

         if (!air) {
            mc.field_1690.field_1832.method_23481(false);
         } else {
            if ((this.Harry.Harry() == HelpType.Harry || this.Harry.Harry() == HelpType.Jack) && mc.field_1724.method_24828()) {
               mc.field_1724.method_6043();
            }

            if (this.Harry.Harry() == HelpType.Harry || this.Harry.Harry() == HelpType.Oliver) {
               mc.field_1690.field_1832.method_23481(true);
               "".length();
               if (" ".length() == "  ".length()) {
                  return;
               }
            }
         }

         "".length();
         if ("   ".length() < "  ".length()) {
            return;
         }
      }

   }

   static enum HelpType {
      // $FF: synthetic field
      Jack("Ghost"),
      // $FF: synthetic field
      Oliver("Simple"),
      // $FF: synthetic field
      Harry("Combined");

      // $FF: synthetic field
      public final String Jacob;

      private HelpType(String name) {
         this.Jacob = name;
         "".length();
         if (-"  ".length() > 0) {
            throw null;
         }
      }

      static {
         "".length();
         if (-(182 ^ 178) < 0) {
            ;
         }
      }
   }

   static enum Mode {
      // $FF: synthetic field
      Jack("Ghost"),
      // $FF: synthetic field
      Oliver("Simple");

      // $FF: synthetic field
      public final String Harry;

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      private Mode(String name) {
         this.Harry = name;
         "".length();
         if ("  ".length() <= 0) {
            throw null;
         }
      }
   }
}
