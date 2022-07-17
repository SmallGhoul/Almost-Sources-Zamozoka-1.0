package net.optifine.features.module.movement;

import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.class_238;
import net.minecraft.class_265;
import net.minecraft.class_2828.class_2829;
import net.minecraft.class_746;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public final class Step extends Module implements UpdateListener {
   // $FF: synthetic field
   private boolean Oscar;
   // $FF: synthetic field
   private final NumberSetting Charlie;
   // $FF: synthetic field
   private boolean George;
   // $FF: synthetic field
   private final NumberSetting Thomas;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final EnumSetting< Mode> Jacob;
   // $FF: synthetic field
   int Harry;

   private static int lIIIlIIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Jacob.Harry());
      "".length();
      return "   ".length() < 0 ? null : var1;
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if ("   ".length() <= 0) {
            return;
         }
      } else {
         if (mc.field_1724.method_24828()) {
            this.Jack = 0;
            "".length();
            if ("  ".length() >= (46 ^ 42)) {
               return;
            }
         } else {
            ++this.Jack;
         }

         switch(( Mode)this.Jacob.Harry()) {
         case Oliver:
            mc.field_1724.field_6013 = this.Charlie.George();
            "".length();
            if ("".length() > "   ".length()) {
               return;
            }
            break;
         case Jack:
            class_746 var10000 = mc.field_1724;
            float var10001;
            if (mc.field_1724.method_24828()) {
               var10001 = 0.6F;
               "".length();
               if (-" ".length() >= "  ".length()) {
                  return;
               }
            } else {
               var10001 = this.Charlie.George();
            }

            var10000.field_6013 = var10001;
            if (mc.field_1724.field_5976 && mc.field_1724.method_24828()) {
               mc.field_1724.method_6043();
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }
            break;
         case Harry:
            if (this.Oliver(this.Charlie.George())) {
               mc.method_1562().method_2883(new class_2829(mc.field_1724.method_23317(), mc.field_1724.method_23318() + 0.42D, mc.field_1724.method_23321(), false));
               mc.method_1562().method_2883(new class_2829(mc.field_1724.method_23317(), mc.field_1724.method_23318() + 0.752D, mc.field_1724.method_23321(), true));
               Timer.Jack = 0.375F;
               if (this.Oliver(1.0F, 0.6F) && lIIIlIIIlI(this.Charlie.Jack(), 1.5D) >= 0) {
                  mc.method_1562().method_2883(new class_2829(mc.field_1724.method_23317(), mc.field_1724.method_23318() + 1.0D, mc.field_1724.method_23321(), true));
                  Timer.Jack = 0.3F;
               }

               mc.field_1724.field_6013 = this.Charlie.George();
               "".length();
               if ((62 ^ 59) == 0) {
                  return;
               }
            } else {
               Timer.Jack = 1.0F;
               mc.field_1724.field_6013 = 0.6F;
               "".length();
               if ((21 + 60 - 6 + 74 ^ 57 + 87 - 129 + 130) == "  ".length()) {
                  return;
               }
            }
            break;
         case Jacob:
            if (this.Oliver(2.0F)) {
               if (mc.field_1724.field_5976) {
                  switch(this.Jack) {
                  case 0:
                     mc.field_1724.method_6043();
                  case 7:
                     mc.field_1724.method_18800(mc.field_1724.method_18798().method_10216(), 0.0D, mc.field_1724.method_18798().method_10215());
                  case 8:
                     mc.field_1724.method_23327(mc.field_1724.method_23317(), mc.field_1724.method_23318() + 1.0D, mc.field_1724.method_23321());
                  default:
                     ++this.Harry;
                     "".length();
                     if ((174 ^ 170) == " ".length()) {
                        return;
                     }
                  }
               } else {
                  this.Harry = 0;
                  "".length();
                  if ("   ".length() == 0) {
                     return;
                  }
               }
            }
            break;
         case Charlie:
            if (mc.field_1724.field_5976) {
               if (mc.field_1724.method_24828()) {
                  mc.field_1724.method_6043();
                  "".length();
                  if (" ".length() <= -" ".length()) {
                     return;
                  }
               } else if (!this.George && this.Oscar) {
                  mc.field_1724.method_18800(mc.field_1724.method_18798().method_10216(), (double)this.Thomas.George(), mc.field_1724.method_18798().method_10215());
               }
            }
         }

         this.Oscar = this.George;
         this.George = mc.field_1724.method_24828();
         "".length();
         if ("   ".length() == 0) {
            return;
         }
      }

   }

   private static int lIIIIlllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      if (mc.field_1724 != null) {
         mc.field_1724.field_6013 = 0.6F;
      }

      "".length();
      if ((124 ^ 120) == (197 ^ 193)) {
         ;
      }
   }

   static {
      "".length();
      if ((194 ^ 198) >= "   ".length()) {
         ;
      }
   }

   public boolean Oliver(float a, float maxhe) {
      class_746 player = mc.field_1724;
      boolean var10;
      if (!player.field_5976) {
         var10 = false;
         "".length();
         if ("".length() != 0) {
            return (boolean)"".length();
         }
      } else if (player.method_24828() && !player.method_6101() && !player.method_5799() && !player.method_5771()) {
         if (lIIIIlllll(player.field_3913.field_3905, 0.0F) == 0 && lIIIIlllll(player.field_3913.field_3907, 0.0F) == 0) {
            var10 = false;
            "".length();
            if ("  ".length() == 0) {
               return (boolean)"".length();
            }
         } else if (player.field_3913.field_3904) {
            var10 = false;
            "".length();
            if (null != null) {
               return (boolean)"".length();
            }
         } else {
            class_238 box = player.method_5829().method_989(0.0D, 0.05D + (double)a, 0.0D).method_1014(0.05D);
            if (!mc.field_1687.method_8587(player, box.method_989(0.0D, (double)maxhe, 0.0D))) {
               var10 = false;
               "".length();
               if ("".length() != 0) {
                  return (boolean)"".length();
               }
            } else {
               double stepHeight = -1.0D;
               ArrayList<class_238> blockCollisions = (ArrayList)mc.field_1687.method_20812(player, box).map(class_265::method_1107).collect(Collectors.toCollection(ArrayList::new));
               Iterator var8 = blockCollisions.iterator();

               while(var8.hasNext()) {
                  class_238 bb = (class_238)var8.next();
                  if (lIIIlIIIII(bb.field_1325, stepHeight) > 0) {
                     stepHeight = bb.field_1325;
                  }

                  "".length();
                  if ("   ".length() > (30 ^ 26)) {
                     return (boolean)"".length();
                  }
               }

               stepHeight -= player.method_23318();
               boolean var10000;
               if (lIIIlIIIIl(stepHeight, 0.0D) >= 0 && lIIIlIIIII(stepHeight, (double)maxhe) <= 0) {
                  var10000 = true;
                  "".length();
                  if (-"  ".length() > 0) {
                     return (boolean)"".length();
                  }
               } else {
                  var10000 = false;
               }

               var10 = var10000;
               "".length();
               if (-"  ".length() > 0) {
                  return (boolean)"".length();
               }
            }
         }
      } else {
         var10 = false;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      }

      return var10;
   }

   public Step() {
      super("Step", "Allows you to step up higher than half-slabs.");
      this.Jacob = new EnumSetting("Mode", "Allows you to fast step on blocks", Mode.values(), Mode.Harry);
      this.Charlie = new NumberSetting("Height", "For basic steps", 1.0D, 1.0D, 10.0D, 0.05D, ValueDisplay.Oliver);
      this.Thomas = new NumberSetting("AirJump Height", "Only works in AJ mode.", 0.6D, 0.0D, 3.0D, 0.01D, ValueDisplay.Oliver);
      this.Jack = 0;
      this.Harry = 0;
      this.Oliver(Category.Jack);
      this.addSetting(this.Jacob);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   private static int lIIIlIIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public boolean George() {
      byte var10000;
      if (!this.isEnabled()) {
         var10000 = 1;
         "".length();
         if (" ".length() < 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)(-" ".length() >= "".length() ? "".length() : var1);
   }

   public boolean Oliver(float maxhe) {
      byte var2 = this.Oliver(0.0F, maxhe);
      "".length();
      return (boolean)("  ".length() != "  ".length() ? "".length() : var2);
   }

   private static int lIIIlIIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static enum Mode {
      // $FF: synthetic field
      Harry("Matrix 6.1");

      // $FF: synthetic field
      private final String Thomas;
      // $FF: synthetic field
      Jacob("AAC 3.6.4"),
      // $FF: synthetic field
      Oliver("Simple"),
      // $FF: synthetic field
      Charlie("Air Jump"),
      // $FF: synthetic field
      Jack("Alice");

      public String toString() {
         String var1 = this.Thomas;
         "".length();
         return "  ".length() < 0 ? null : var1;
      }

      private Mode(String name) {
         this.Thomas = name;
         "".length();
         if ("".length() != "".length()) {
            throw null;
         }
      }

      static {
         "".length();
         if ((0 ^ 5) > 0) {
            ;
         }
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Thomas;
         "".length();
         return (7 ^ 9 ^ 171 ^ 161) <= "   ".length() ? null : var1;
      }
   }
}
