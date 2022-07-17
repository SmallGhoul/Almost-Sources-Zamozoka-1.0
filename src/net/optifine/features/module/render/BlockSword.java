package net.optifine.features.module.render;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.managers.event.events.ItemRenderListener;
import net.optifine.managers.event.events.ItemRenderListener.ItemRenderEvent;
import net.optifine.managers.event.events.ItemTransformListener;
import net.optifine.managers.event.events.ItemTransformListener.ItemTransformEvent;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.RenderListener;
import net.minecraft.class_1160;
import net.minecraft.class_1802;
import net.minecraft.class_2879;
import net.minecraft.class_4587;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class BlockSword extends Module implements ItemRenderListener, RenderListener, ItemTransformListener, PacketOutputListener {
   // $FF: synthetic field
   private final BooleanSetting George;
   // $FF: synthetic field
   long Harry = 2147483647L;
   // $FF: synthetic field
   double Jack = 0.0D;
   // $FF: synthetic field
   double Jacob = 0.0D;
   // $FF: synthetic field
   private final NumberSetting Charlie = new NumberSetting("Speed", "Works for Astolfo modes", 1.0D, 0.01D, 2.0D, 0.01D);
   // $FF: synthetic field
   private final BooleanSetting Oscar;
   // $FF: synthetic field
   private final EnumSetting< Mode> Thomas;

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2879) {
         long s = System.currentTimeMillis() - this.Harry;
         long msNeeded = 300L;
         switch(( Mode)this.Thomas.Harry()) {
         case Jacob:
            msNeeded = 400L;
            "".length();
            if (null != null) {
               return;
            }
            break;
         case Thomas:
            msNeeded = 500L;
            "".length();
            if (-(43 + 12 - -66 + 45 ^ 114 + 71 - 23 + 0) >= 0) {
               return;
            }
            break;
         case Harry:
            msNeeded = 150L;
         }

         if (llIIIlIlll(s, msNeeded) > 0) {
            this.Jacob = 0.0D;
            this.Harry = System.currentTimeMillis();
         }
      }

      "".length();
      if (-(116 ^ 83 ^ 80 ^ 115) < 0) {
         ;
      }
   }

   private boolean Thomas() {
      String name = mc.field_1724.field_7514.method_5438(mc.field_1724.field_7514.field_7545).method_7909().toString().toLowerCase();
      byte var2 = this.Jack(name);
      "".length();
      return (boolean)(null != null ? "".length() : var2);
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(ItemRenderListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      EVENT_MANAGER.Oliver(ItemTransformListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      "".length();
      if ("   ".length() >= 0) {
         ;
      }
   }

   public void Oliver(float partialTicks) {
      if (this.Thomas() && (mc.field_1724.method_6039() || mc.field_1724.field_7514.method_5438(40).method_7909() == class_1802.field_8255 && mc.field_1690.field_1904.method_1434() || this.Oscar.Jack() && llIIIlIllI(System.currentTimeMillis() - this.Harry, 700L) < 0) && !mc.field_1773.method_19418().method_19333()) {
         mc.field_1724.field_6251 = 0.0F;
         mc.field_1724.method_7350();
         this.Jack += (double)mc.method_1534();
      }

      "".length();
      if (" ".length() > "".length()) {
         ;
      }
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(ItemRenderListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      EVENT_MANAGER.Jack(ItemTransformListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int llIIIlIllI(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public String Oliver() {
      StringBuilder var10000 = new StringBuilder();
      String var10001;
      if (this.George.Jack()) {
         var10001 = "Smooth ";
         "".length();
         if ("  ".length() != "  ".length()) {
            return null;
         }
      } else {
         var10001 = "";
      }

      String var1 = String.valueOf(var10000.append(var10001).append( Mode.Oliver(( Mode)this.Thomas.Harry())));
      "".length();
      return "   ".length() < "  ".length() ? null : var1;
   }

   private static int llIIIlIIll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static int llIIIlIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(ItemRenderEvent event) {
      if (mc.field_1724 == null) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         if (event.Jack.method_7909() == class_1802.field_8255) {
            event.Oliver.method_22904(40000.0D, 40000.0D, 40000.0D);
         }

         if ((mc.field_1724.method_6039() || mc.field_1724.field_7514.method_5438(40).method_7909() == class_1802.field_8255 && mc.field_1690.field_1904.method_1434() || this.Oscar.Jack() && llIIIlIIll(System.currentTimeMillis() - this.Harry, 600L) < 0) && !mc.field_1773.method_19418().method_19333() && this.Thomas()) {
            event.Oliver.method_22904(0.0D, 0.2D, 0.0D);
            long s = System.currentTimeMillis() - this.Harry;
            double offset = 0.0D;
            double var10000;
            if (llIIIlIIll(s, 100L) < 0) {
               var10000 = (double)s / 300.0D;
               "".length();
               if ("   ".length() <= " ".length()) {
                  return;
               }
            } else {
               var10000 = 1.0D - (double)s / 300.0D;
            }

            double v = var10000;
            if (llIIIlIIll(s, 150L) < 0) {
               if (llIIIlIIll(s, 50L) < 0) {
                  var10000 = (double)s / 150.0D;
                  "".length();
                  if (-(144 + 134 - 221 + 98 ^ 94 + 125 - 139 + 79) >= 0) {
                     return;
                  }
               } else {
                  var10000 = 1.0D - (double)s / 150.0D;
                  "".length();
                  if ((143 ^ 166 ^ 117 ^ 88) != (126 + 135 - 189 + 77 ^ 59 + 140 - 70 + 16)) {
                     return;
                  }
               }
            } else {
               var10000 = 0.0D;
            }

            double offset1 = var10000;
            class_1160 var10001;
            double var10004;
            class_4587 var10;
            switch(( Mode)this.Thomas.Harry()) {
            case Charlie:
               if (llIIIlIlII((double)s, 300.0D) < 0) {
                  var10000 = v;
                  "".length();
                  if ((87 + 73 - 77 + 48 ^ 40 + 107 - 21 + 8) == 0) {
                     return;
                  }
               } else {
                  var10000 = 0.0D;
               }

               offset = var10000;
               if (this.George.Jack()) {
                  offset = (double)((float)(this.Jacob + (1.0D - this.Jacob) * Math.pow((double)mc.method_1534() / 50.0D, 0.5D)));
               }

               event.Oliver.method_22904(0.0D, 0.4D, 0.0D);
               event.Oliver.method_22905(0.5F, 0.5F, 0.5F);
               var10 = event.Oliver;
               var10001 = class_1160.field_20703;
               if (llIIIlIlIl(offset, 0.33D) > 0) {
                  var10004 = 1.0D - offset;
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return;
                  }
               } else {
                  var10004 = offset;
               }

               var10.method_22907(var10001.method_23214((float)(-45.0D + -60.0D * var10004)));
               "".length();
               if (-" ".length() == " ".length()) {
                  return;
               }
               break;
            case Oliver:
               if (llIIIlIlII((double)s, 300.0D) < 0) {
                  var10000 = v;
                  "".length();
                  if (-" ".length() > (149 + 13 - 110 + 137 ^ 115 + 1 - 60 + 129)) {
                     return;
                  }
               } else {
                  var10000 = 0.0D;
               }

               offset = var10000;
               if (this.George.Jack()) {
                  offset = (double)((float)(this.Jacob + (1.0D - this.Jacob) * Math.pow((double)mc.method_1534() / 50.0D, 0.5D)));
               }

               event.Oliver.method_22904(0.0D, 0.4D, 0.0D);
               event.Oliver.method_22905(0.75F, 0.75F, 0.75F);
               var10 = event.Oliver;
               var10001 = class_1160.field_20703;
               if (llIIIlIlIl(offset, 0.33D) > 0) {
                  var10004 = 1.0D - offset;
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var10004 = offset;
               }

               var10.method_22907(var10001.method_23214((float)(-45.0D + -60.0D * var10004)));
               "".length();
               if ("".length() <= -" ".length()) {
                  return;
               }
               break;
            case Jack:
               event.Oliver.method_22904(0.0D, 0.4D, 0.0D);
               event.Oliver.method_22905(0.75F, 0.75F, 0.75F);
               event.Oliver.method_22907(class_1160.field_20703.method_23214(-45.0F));
               "".length();
               if ("  ".length() != "  ".length()) {
                  return;
               }
               break;
            case Jacob:
               if (llIIIlIlII((double)s, 400.0D) < 0) {
                  if (llIIIlIIll(s, 100L) < 0) {
                     var10000 = (double)s / 400.0D;
                     "".length();
                     if ((139 ^ 142) <= 0) {
                        return;
                     }
                  } else {
                     var10000 = 1.0D - (double)s / 400.0D;
                     "".length();
                     if ("".length() != 0) {
                        return;
                     }
                  }
               } else {
                  var10000 = 0.0D;
               }

               offset = var10000;
               if (this.George.Jack()) {
                  offset = (double)((float)(this.Jacob + (1.0D - this.Jacob) * Math.pow((double)mc.method_1534() / 150.0D, 0.5D)));
               }

               event.Oliver.method_22904(0.0D, 0.4D, 0.0D);
               event.Oliver.method_22905(0.75F, 0.75F, 0.75F);
               var10 = event.Oliver;
               var10001 = class_1160.field_20703;
               if (llIIIlIlIl(offset, 0.25D) > 0) {
                  var10004 = 1.0D - offset;
                  "".length();
                  if (" ".length() != " ".length()) {
                     return;
                  }
               } else {
                  var10004 = offset;
               }

               var10.method_22907(var10001.method_23214((float)(-45.0D + -25.0D * var10004)));
               "".length();
               if ("   ".length() == " ".length()) {
                  return;
               }
               break;
            case Thomas:
               if (llIIIlIIll(s, 500L) < 0) {
                  var10000 = (double)s / 500.0D;
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var10000 = 0.0D;
               }

               offset = var10000;
               if (this.George.Jack()) {
                  offset = (double)((float)(this.Jacob + (1.0D - this.Jacob) * Math.pow((double)mc.method_1534() / 50.0D, 0.5D)));
               }

               event.Oliver.method_22904(0.0D, 0.4D, 0.0D);
               event.Oliver.method_22905(0.75F, 0.75F, 0.75F);
               event.Oliver.method_22907(class_1160.field_20703.method_23214(-45.0F));
               event.Oliver.method_22907(class_1160.field_20707.method_23214((float)(-15.0D * offset)));
               "".length();
               if ((198 ^ 157 ^ 234 ^ 181) < "   ".length()) {
                  return;
               }
               break;
            case Harry:
               offset = offset1;
               if (this.George.Jack()) {
                  offset = (double)((float)(this.Jacob + (1.0D - this.Jacob) * Math.pow((double)mc.method_1534() / 50.0D, 0.5D)));
               }

               event.Oliver.method_22904(0.0D, 0.4D, 0.0D);
               var10 = event.Oliver;
               var10001 = class_1160.field_20703;
               if (llIIIlIlIl(offset, 0.33D) > 0) {
                  var10004 = 1.0D - offset;
                  "".length();
                  if (-" ".length() > 0) {
                     return;
                  }
               } else {
                  var10004 = offset;
               }

               var10.method_22907(var10001.method_23214((float)(-45.0D + -25.0D * var10004)));
            }

            event.Oliver.method_22907(class_1160.field_20703.method_23214(-90.0F));
            event.Oliver.method_22907(class_1160.field_20707.method_23214(45.0F));
            this.Jacob = offset;
         }

         "".length();
         if ("".length() > 0) {
            return;
         }
      }

   }

   public void Oliver(ItemTransformEvent event) {
      if ((mc.field_1724.method_6039() || mc.field_1724.field_7514.method_5438(40).method_7909() == class_1802.field_8255 && mc.field_1690.field_1904.method_1434()) && !mc.field_1773.method_19418().method_19333()) {
         double var10000 = (double)(System.currentTimeMillis() - this.Harry);
         int var4 = null.Oliver[(( Mode)this.Thomas.Harry()).ordinal()];
         "".length();
      }

      "".length();
      if (" ".length() >= 0) {
         ;
      }
   }

   static {
      "".length();
      if ("  ".length() != " ".length()) {
         ;
      }
   }

   private static int llIIIlIlll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public BlockSword() {
      super("BlockAnimation", "Makes you block with your sword like in 1.8.", Category.Harry);
      this.Thomas = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.George = new BooleanSetting("Smooth", true);
      this.Oscar = new BooleanSetting("Fake AutoBlock", true);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      "".length();
      if ("".length() == " ".length()) {
         throw null;
      }
   }

   private static int llIIIlIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private boolean Jack(String s) {
      byte var10000;
      if (s.contains("sword") || s.contains("axe") && !s.contains("pic")) {
         var10000 = 1;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var2 = var10000;
      "".length();
      return (boolean)("".length() < 0 ? "".length() : var2);
   }

   private static enum Mode {
      // $FF: synthetic field
      Harry("Active"),
      // $FF: synthetic field
      Thomas("Rad");

      // $FF: synthetic field
      private final String George;
      // $FF: synthetic field
      Oliver("Normal"),
      // $FF: synthetic field
      Charlie("Passive"),
      // $FF: synthetic field
      Jack("Static"),
      // $FF: synthetic field
      Jacob("Slowy");

      private Mode(String name) {
         this.George = name;
         "".length();
         if (-" ".length() > " ".length()) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.George;
         "".length();
         return "".length() > (166 ^ 162) ? null : var1;
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.George;
         "".length();
         return "".length() > 0 ? null : var1;
      }
   }
}
