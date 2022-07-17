package net.optifine.features.module.combat;

import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.LeftClickListener;
import net.optifine.managers.event.events.LeftClickListener.LeftClickEvent;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.UpdateListener;
import net.optifine.util.DelayedPacket;
import net.optifine.util.gui.Translatable;
import io.netty.util.internal.ConcurrentSet;
import net.minecraft.*;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2828.class_2829;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;

public final class Criticals extends Module implements UpdateListener, PacketOutputListener, LeftClickListener {
   // $FF: synthetic field
   private final BooleanSetting Elizabeth;
   // $FF: synthetic field
   private final BooleanSetting Jennifer;
   // $FF: synthetic field
   boolean George;
   // $FF: synthetic field
   private final BooleanSetting Linda;
   // $FF: synthetic field
   private final NumberSetting Mary;
   // $FF: synthetic field
   boolean Thomas;
   // $FF: synthetic field
   private boolean Barbara;
   // $FF: synthetic field
   int Jacob;
   // $FF: synthetic field
   ConcurrentSet<DelayedPacket> Harry;
   // $FF: synthetic field
   private final NumberSetting Patricia;
   // $FF: synthetic field
   int Jack;
   // $FF: synthetic field
   private final NumberSetting James;
   // $FF: synthetic field
   long Charlie;
   // $FF: synthetic field
   private final NumberSetting William;
   // $FF: synthetic field
   private final EnumSetting< Mode> Oscar;

   public void Jacob() {
      EVENT_MANAGER.Oliver(LeftClickListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      "".length();
      if (-" ".length() < " ".length()) {
         ;
      }
   }

   private static int lIIlIIIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (mc.field_1724 == null) {
         "".length();
         if ((66 ^ 70) <= "  ".length()) {
            return;
         }
      } else {
         Mode mode = ( Mode)this.Oscar.Harry();
         class_2596<?> packet = event.Jacob();
         double posX = mc.field_1724.method_23317();
         double posY = mc.field_1724.method_23318();
         double posZ = mc.field_1724.method_23321();
         switch(mode) {
         case George:
            if (packet instanceof class_2824 || packet instanceof class_2879) {
               this.Thomas = true;
               this.George = false;
            }
         }

         "".length();
         if (" ".length() <= 0) {
            return;
         }
      }

   }

   private void Oliver(double x, double y, double z, boolean onGround) {
      if (mc.field_1724 == null) {
         "".length();
         if (-" ".length() >= 0) {
            return;
         }
      } else {
         mc.field_1724.field_3944.method_2883(new class_2829(x, y, z, onGround));
         "".length();
         if ("  ".length() == (5 ^ 56 ^ 28 ^ 37)) {
            return;
         }
      }

   }

   public void George() {
      if (!this.isEnabled()) {
         "".length();
         if ((72 + 68 - 78 + 108 ^ 155 + 163 - 175 + 31) <= 0) {
            return;
         }
      } else if (!mc.field_1724.method_24828()) {
         "".length();
         if (" ".length() != " ".length()) {
            return;
         }
      } else if (!mc.field_1724.method_5799() && !mc.field_1724.method_5771()) {
         if (this.Elizabeth.Jack() && lIIlIIIlIII(mc.field_1724.method_18798().method_1033(), 0.029999999329447746D) < 0) {
            if (this.Linda.Jack()) {
               mc.field_1724.method_6043();
            }

            "".length();
            if ("".length() > "   ".length()) {
               return;
            }
         } else if (lIIlIIIlIIl(System.currentTimeMillis() - this.Charlie, (long)this.James.Oscar()) < 0) {
            if (this.Linda.Jack()) {
               mc.field_1724.method_6043();
            }

            "".length();
            if ("  ".length() <= 0) {
               return;
            }
         } else {
            this.Charlie = System.currentTimeMillis();
            if (lIIlIIIlIlI(Math.random(), (double)this.William.George()) > 0) {
               if (this.Linda.Jack()) {
                  mc.field_1724.method_6043();
               }

               "".length();
               if (null != null) {
                  return;
               }
            } else {
               double posX = mc.field_1724.method_23317();
               double posY = mc.field_1724.method_23318();
               double posZ = mc.field_1724.method_23321();
               switch(( Mode)this.Oscar.Harry()) {
               case George:
               case Thomas:
                  this.Oliver(posX, posY, posZ, false);
                  this.Oliver(posX, posY + 0.41999998688697815D, posZ, true);
                  this.Oliver(posX, posY + 0.3199999928474426D, posZ, false);
                  mc.field_1724.method_18800(0.0D, 0.0D, 0.0D);
                  if (this.Oscar.Harry() == Mode.Thomas) {
                     mc.field_1724.method_5814(posX, posY + 0.23520000278949738D, posZ);
                     "".length();
                     if ((72 ^ 76) < 0) {
                        return;
                     }
                  } else {
                     Timer.Jack = 0.7F;
                     mc.field_1724.method_18800(0.0D, 0.0D, 0.0D);
                     this.Oliver(posX, posY + 0.23520000278949738D, posZ, false);
                     this.George = true;
                     "".length();
                     if ((92 + 68 - 104 + 93 ^ 36 + 2 - -52 + 55) > (19 ^ 25 ^ 178 ^ 188)) {
                        return;
                     }
                  }
                  break;
               case Oliver:
                  this.Oliver(posX, posY + 0.11D, posZ, true);
                  this.Oliver(posX, posY + 0.1100013579D, posZ, false);
                  this.Oliver(posX, posY + 1.3579E-6D, posZ, false);
                  "".length();
                  if ("  ".length() > (55 ^ 51)) {
                     return;
                  }
                  break;
               case Jack:
                  this.Oliver(posX, posY, posZ, false);
                  this.Oliver(posX, posY + 0.42D, posZ, false);
                  this.Oliver(posX, posY, posZ, false);
                  this.Oliver(posX, posY + 0.0625D, posZ, false);
                  this.Oliver(posX, posY, posZ, false);
                  this.Oliver(posX, posY + 1.1E-5D, posZ, false);
                  this.George = true;
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break;
               case Harry:
                  mc.field_1724.method_5762(0.0D, 0.1D, 0.0D);
                  mc.field_1724.field_6017 = 0.1F;
                  mc.field_1724.method_24830(false);
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return;
                  }
                  break;
               case Charlie:
               case Jacob:
                  mc.field_1724.method_6043();
               }

               "".length();
               if ("".length() > (73 ^ 77)) {
                  return;
               }
            }
         }
      } else {
         "".length();
         if (" ".length() == 0) {
            return;
         }
      }

   }

   public Criticals() {
      super("Criticals", Translatable.CRITICAL, Category.Oliver);
      this.Oscar = new EnumSetting("Mode", Mode.values(), Mode.Oliver);
      this.James = new NumberSetting("Delay", 200.0D, 0.0D, 3000.0D, 10.0D);
      this.William = new NumberSetting("Chance", 1.0D, 0.0D, 1.0D, 0.01D, ValueDisplay.Harry);
      this.Mary = new NumberSetting("Port Tick", 1.0D, 1.0D, 10.0D, 1.0D, ValueDisplay.Jack);
      this.Patricia = new NumberSetting("Motion Y for Port", -1.0D, -1.0D, 0.3D, 0.01D);
      this.Jennifer = new BooleanSetting("Show Fake Crit Particles", false);
      this.Elizabeth = new BooleanSetting("While Not Moving", true);
      this.Linda = new BooleanSetting("Jump if Failed Chance or Delay", true);
      this.Jack = 0;
      this.Harry = new ConcurrentSet();
      this.Jacob = 0;
      this.Charlie = 0L;
      this.Thomas = false;
      this.George = false;
      this.addSetting(this.Oscar);
      this.addSetting(this.James);
      this.addSetting(this.William);
      this.addSetting(this.Jennifer);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      "".length();
      if ("".length() < 0) {
         throw null;
      }
   }

   public String Oliver() {
      String var1 = Mode.Oliver(( Mode)this.Oscar.Harry());
      "".length();
      return "  ".length() == 0 ? null : var1;
   }

   private static int lIIlIIIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIlIIIlIIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public void Thomas() {
      if (mc.field_1724 == null) {
         "".length();
         if (" ".length() <= -" ".length()) {
            return;
         }
      } else {
         boolean ground = mc.field_1724.method_24828();
         if (ground) {
            this.Jack = 0;
            "".length();
            if (-"  ".length() >= 0) {
               return;
            }
         } else {
            ++this.Jack;
         }

         if (mc.field_1724.field_6235 > 0) {
            this.Jacob = mc.field_1724.field_6012;
         }

         double posX = mc.field_1724.method_23317();
         double posY = mc.field_1724.method_23318();
         double posZ = mc.field_1724.method_23321();
         switch(( Mode)this.Oscar.Harry()) {
         case George:
            if (this.Thomas) {
               this.Oliver(posX, posY, posZ, false);
               Timer.Jack = 1.0F;
               "".length();
               if (-" ".length() > "".length()) {
                  return;
               }
            }
            break;
         case Jack:
            if (this.Thomas) {
               this.Oliver(posX, posY, posZ, true);
               "".length();
               if (-(66 ^ 71) >= 0) {
                  return;
               }
            }
            break;
         case Charlie:
            if (this.Barbara && this.Jack == this.Mary.Oscar()) {
               class_243 vel = mc.field_1724.method_18798();
               mc.field_1724.method_18800(vel.field_1352, (double)this.Patricia.George(), vel.field_1350);
               this.Barbara = false;
            }
         }

         this.Thomas = false;
         "".length();
         if ("   ".length() < -" ".length()) {
            return;
         }
      }

   }

   public void Charlie() {
      EVENT_MANAGER.Jack(LeftClickListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      "".length();
      if (-" ".length() != "".length()) {
         ;
      }
   }

   static {
      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   public void Oliver(LeftClickEvent event) {
      if (mc.field_1765 != null && mc.field_1765.method_17783() == class_240.field_1331 && ((class_3966)mc.field_1765).method_17782() instanceof class_1309) {
         this.Barbara = true;
         if (this.Jennifer.Jack()) {
            mc.field_1724.method_7277(((class_3966)mc.field_1765).method_17782());
         }

         this.George();
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else {
         "".length();
         if ("  ".length() == 0) {
            return;
         }
      }

   }

   private static enum Mode {
      // $FF: synthetic field
      Jacob("Jump"),
      // $FF: synthetic field
      Thomas("Static Matrix"),
      // $FF: synthetic field
      George("Calm Matrix");

      // $FF: synthetic field
      private final String Oscar;
      // $FF: synthetic field
      Jack("NCP"),
      // $FF: synthetic field
      Charlie("YPort"),
      // $FF: synthetic field
      Harry("Artemis"),
      // $FF: synthetic field
      Oliver("Packet");

      static {
         "".length();
         if ("".length() == 0) {
            ;
         }
      }

      private Mode(String name) {
         this.Oscar = name;
         "".length();
         if (-" ".length() == "".length()) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Oscar;
         "".length();
         return "  ".length() <= -" ".length() ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Mode x0) {
         String var1 = x0.Oscar;
         "".length();
         return "   ".length() == "  ".length() ? null : var1;
      }
   }
}
