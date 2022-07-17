package net.optifine.features.module.combat;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.KnockbackListener;
import net.optifine.managers.event.events.KnockbackListener.KnockbackEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.NoSuchElementException;
import java.util.stream.StreamSupport;

public final class Velocity extends Module implements KnockbackListener, UpdateListener {
   // $FF: synthetic field
   private final BooleanSetting Thomas;
   // $FF: synthetic field
   private final NumberSetting George;
   // $FF: synthetic field
   private final NumberSetting James;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final NumberSetting Oscar;
   // $FF: synthetic field
   private final BooleanSetting Mary;
   // $FF: synthetic field
   private final BooleanSetting Patricia;
   // $FF: synthetic field
   private final EnumSetting< Mode> Charlie;
   // $FF: synthetic field
   double Harry;
   // $FF: synthetic field
   private final NumberSetting William;
   // $FF: synthetic field
   int Jacob;

   private static int lIIIIIlIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public String Oliver() {
      boolean var10000;
      if (this.Charlie.Harry() != Mode.Jack && this.Charlie.Harry() != Mode.Oliver) {
         var10000 = false;
      } else {
         var10000 = true;
         "".length();
         if ((36 ^ 33) <= 0) {
            return null;
         }
      }

      boolean percent = var10000;
      StringBuilder var3 = (new StringBuilder()).append( Mode.Oliver(( Mode)this.Charlie.Harry()));
      String var10001;
      if (percent && this.Mary.Jack()) {
         StringBuilder var4 = new StringBuilder();
         String var10002;
         if (this.Patricia.Jack()) {
            var10002 = " h=";
            "".length();
            if (null != null) {
               return null;
            }
         } else {
            var10002 = " ";
         }

         var4 = var4.append(var10002).append(Math.round(this.George.George() * 100.0F));
         if (this.Patricia.Jack()) {
            var10002 = "% v=";
            "".length();
            if (-" ".length() >= "".length()) {
               return null;
            }
         } else {
            var10002 = "% ";
         }

         var10001 = String.valueOf(var4.append(var10002).append(Math.round(this.Oscar.George() * 100.0F)).append("%"));
         "".length();
         if (-" ".length() > 0) {
            return null;
         }
      } else {
         var10001 = "";
      }

      String var2 = String.valueOf(var3.append(var10001));
      "".length();
      return " ".length() <= "".length() ? null : var2;
   }

   public void Thomas() {
      ++this.Jack;
      if (this.Thomas.Jack() && lIIIIIlIIlI(this.Harry, 0.03D) < 0) {
         "".length();
         if (null != null) {
            return;
         }
      } else {
         boolean ground = mc.field_1724.method_24828();
         if (ground) {
            this.Jacob = 0;
            "".length();
            if (" ".length() == 0) {
               return;
            }
         } else {
            ++this.Jacob;
         }

         class_243 vel;
         switch(( Mode)this.Charlie.Harry()) {
         case James:
            if (this.Jack < 2 || this.Jack > 6) {
               break;
            }

            try {
               class_1297 entity = (class_1297)StreamSupport.stream(mc.field_1687.method_18112().spliterator(), true).filter((e) -> {
                  byte var10000;
                  if (e != mc.field_1724) {
                     var10000 = 1;
                     "".length();
                     if ("".length() != 0) {
                        return (boolean)"".length();
                     }
                  } else {
                     var10000 = 0;
                  }

                  byte var1 = var10000;
                  "".length();
                  return (boolean)((135 ^ 131) < 0 ? "".length() : var1);
               }).filter((e) -> {
                  byte var1 = e instanceof class_1657;
                  "".length();
                  return (boolean)(" ".length() >= (230 ^ 163 ^ 126 ^ 63) ? "".length() : var1);
               }).filter((e) -> {
                  byte var10000;
                  if (lIIIIIlIlII(mc.field_1724.method_5739(e), 6.0F) <= 0) {
                     var10000 = 1;
                     "".length();
                     if (-" ".length() > 0) {
                        return (boolean)"".length();
                     }
                  } else {
                     var10000 = 0;
                  }

                  byte var1 = var10000;
                  "".length();
                  return (boolean)(-"  ".length() >= 0 ? "".length() : var1);
               }).findFirst().get();
               int i = 0;

               while(i < 10) {
                  mc.field_1724.field_3944.method_2883(new class_2824(entity, mc.field_1724.method_5715()));
                  mc.field_1724.field_3944.method_2883(new class_2879(class_1268.field_5808));
                  ++i;
                  "".length();
                  if (null != null) {
                     return;
                  }
               }

               mc.field_1724.method_18800(0.0D, mc.field_1724.method_18798().field_1351, 0.0D);
            } catch (NoSuchElementException var4) {
               "".length();
               if (-"  ".length() < 0) {
                  break;
               }

               return;
            }

            "".length();
            if (" ".length() > "   ".length()) {
               return;
            }
            break;
         case Thomas:
            if (this.Jack >= 5 && this.Jack <= 9) {
               mc.field_1724.method_18800(mc.field_1724.method_18798().field_1352 * 0.6D, mc.field_1724.method_18798().field_1351, mc.field_1724.method_18798().field_1350 * 0.6D);
               "".length();
               if ("".length() != 0) {
                  return;
               }
            }
            break;
         case George:
            if (this.Jacob == this.James.Oscar() && lIIIIIlIIlI((double)this.Jack, this.James.Patricia()) <= 0) {
               vel = mc.field_1724.method_18798();
               mc.field_1724.method_18800(vel.field_1352, (double)this.William.George(), vel.field_1350);
               "".length();
               if (" ".length() >= "   ".length()) {
                  return;
               }
            }
            break;
         case William:
            if (this.Jack == 3) {
               mc.field_1724.method_18799(mc.field_1724.method_18798().method_18805(this.George.Jack(), 1.0D, this.George.Jack()));
               "".length();
               if ("  ".length() < 0) {
                  return;
               }
            }
            break;
         case Oscar:
            if (this.Jack < 2) {
               mc.field_1724.method_24830(true);
               vel = mc.field_1724.method_18798();
               mc.field_1724.method_18800(0.0D, vel.method_10214(), 0.0D);
               "".length();
               if ((145 + 149 - 154 + 42 ^ 84 + 152 - 225 + 168) <= 0) {
                  return;
               }
            }
            break;
         case Harry:
            if (this.Jack == 1 && mc.field_1724.method_24828() && lIIIIIlIIll(this.Harry, 0.0D) > 0) {
               mc.field_1724.method_6043();
            }
         }

         "".length();
         if (null != null) {
            return;
         }
      }

   }

   public void Oliver(KnockbackEvent event) {
      this.Jack = 0;
      this.Harry = event.Oscar();
      double verticalMultiplier = this.Oscar.Jack();
      double horizontalMultiplier = this.George.Jack();
      if (this.Thomas.Jack() && lIIIIIlIIIl(event.Oscar(), 0.03D) < 0) {
         event.Oliver();
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         switch(( Mode)this.Charlie.Harry()) {
         case Oliver:
            event.Oliver(event.George() * horizontalMultiplier);
            event.Jack(event.Oscar() * verticalMultiplier);
            event.Harry(event.James() * horizontalMultiplier);
            "".length();
            if ((253 ^ 146 ^ 201 ^ 162) < 0) {
               return;
            }
            break;
         case Charlie:
            event.Oliver();
            "".length();
            if ("".length() >= "  ".length()) {
               return;
            }
            break;
         case Jack:
            event.Oliver();
            class_243 vel = mc.field_1724.method_18798();
            mc.field_1724.method_18800(vel.method_10216() + event.George() * horizontalMultiplier, event.Oscar() * verticalMultiplier, vel.method_10215() + event.James() * horizontalMultiplier);
            "".length();
            if (" ".length() == (113 ^ 117)) {
               return;
            }
            break;
         case Jacob:
            event.Oliver();
            mc.field_1724.method_6043();
         }

         "".length();
         if ((151 ^ 147) <= "   ".length()) {
            return;
         }
      }

   }

   private static int lIIIIIlIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIIIIlIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(KnockbackListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (-" ".length() < "  ".length()) {
         ;
      }
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(KnockbackListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (" ".length() > -" ".length()) {
         ;
      }
   }

   static {
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public Velocity() {
      super("Velocity", "Reduces the knockback from other entities and plugins");
      this.Charlie = new EnumSetting("Mode", "", Mode.values(), Mode.Oliver);
      this.Thomas = new BooleanSetting("No Down", true);
      this.George = new NumberSetting("Horizontal Strength", 1.0D, -1.0D, 1.0D, 0.001D, ValueDisplay.Harry);
      this.Oscar = new NumberSetting("Vertical Strength", 1.0D, -1.0D, 1.0D, 0.001D, ValueDisplay.Harry);
      this.James = new NumberSetting("Y-Port Tick", 1.0D, 1.0D, 10.0D, 1.0D, ValueDisplay.Jack);
      this.William = new NumberSetting("Y-Motion for Port", -1.0D, 1.0D, 1.0D, 0.01D, ValueDisplay.Oliver);
      this.Mary = new BooleanSetting("Show Percents In ArrayList", true);
      this.Patricia = new BooleanSetting("Letters for Percents In ArrayList", true);
      this.Jack = 16;
      this.Harry = 0.0D;
      this.Jacob = 0;
      this.Oliver((Category)Category.Oliver);
      this.addSetting(this.Charlie);
      this.addSetting(this.Thomas);
      this.addSetting(this.George);
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      "".length();
      if (" ".length() != " ".length()) {
         throw null;
      }
   }

   private static int lIIIIIlIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static enum Mode {
      // $FF: synthetic field
      James("Redesky"),
      // $FF: synthetic field
      Thomas("AAC4"),
      // $FF: synthetic field
      Harry("Jump"),
      // $FF: synthetic field
      William("OldAAC"),
      // $FF: synthetic field
      Oliver("Simple"),
      // $FF: synthetic field
      Jacob("Cancel Jump"),
      // $FF: synthetic field
      Charlie("Cancel"),
      // $FF: synthetic field
      Jack("Additive");

      // $FF: synthetic field
      private final String Mary;
      // $FF: synthetic field
      Oscar("MatrixPush"),
      // $FF: synthetic field
      George("YPort");

      public String toString() {
         String var1 = this.Mary;
         "".length();
         return "  ".length() > "  ".length() ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Mary;
         "".length();
         return "".length() != 0 ? null : var1;
      }

      static {
         "".length();
         if (null == null) {
            ;
         }
      }

      private Mode(String name) {
         this.Mary = name;
         "".length();
         if (null != null) {
            throw null;
         }
      }
   }
}
