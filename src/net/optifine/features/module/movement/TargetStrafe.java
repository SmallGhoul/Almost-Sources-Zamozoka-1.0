package net.optifine.features.module.movement;

import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.JumpBoostEventListener;
import net.optifine.managers.event.events.JumpBoostEventListener.JumpBoostEvent;
import net.optifine.managers.event.events.KnockbackListener;
import net.optifine.managers.event.events.KnockbackListener.KnockbackEvent;
import net.optifine.managers.event.events.PacketOutputListener;
import net.optifine.managers.event.events.PacketOutputListener.PacketOutputEvent;
import net.optifine.managers.event.events.StrafeEventListener;
import net.optifine.managers.event.events.StrafeEventListener.StrafeEvent;
import net.optifine.util.BlockUtils;
import net.optifine.util.MovementUtils;
import net.optifine.util.RotationUtils;
import net.optifine.util.math.MathUtils;
import net.minecraft.*;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

public class TargetStrafe extends Module implements KnockbackListener, StrafeEventListener, PacketOutputListener, JumpBoostEventListener {
   // $FF: synthetic field
   private final BooleanSetting Jennifer;
   // $FF: synthetic field
   BooleanSetting Jack;
   // $FF: synthetic field
   private final NumberSetting Mary;
   // $FF: synthetic field
   NumberSetting Harry;
   // $FF: synthetic field
   int Charlie;
   // $FF: synthetic field
   class_1297 Thomas;
   // $FF: synthetic field
   private final NumberSetting Linda;
   // $FF: synthetic field
   private final NumberSetting Barbara;
   // $FF: synthetic field
   int James;
   // $FF: synthetic field
   private final BooleanSetting William = new BooleanSetting("Damage Boost", false);
   // $FF: synthetic field
   private final NumberSetting Susan;
   // $FF: synthetic field
   private final BooleanSetting Elizabeth;
   // $FF: synthetic field
   private final NumberSetting Jessica;
   // $FF: synthetic field
   private final NumberSetting Margaret;
   // $FF: synthetic field
   int Oscar;
   // $FF: synthetic field
   BooleanSetting Jacob;
   // $FF: synthetic field
   private final NumberSetting Patricia;
   // $FF: synthetic field
   long George;

   public boolean Thomas() {
      byte var10000;
      if (Global.Jack().JacoB.isEnabled() && (this.Thomas = Global.Jack().JacoB.Jennifer()) != null) {
         var10000 = 1;
         "".length();
         if (-(97 ^ 101) > 0) {
            return (boolean)"".length();
         }
      } else {
         var10000 = 0;
      }

      byte var1 = var10000;
      "".length();
      return (boolean)(" ".length() != " ".length() ? "".length() : var1);
   }

   public TargetStrafe() {
      super("TargetStrafe", "Allows you to target strafe around players.");
      this.Mary = new NumberSetting("Damage Ticks", 3.0D, 1.0D, 30.0D, 1.0D, ValueDisplay.Jack);
      this.Patricia = new NumberSetting("Damage Multiplier", 1.2D, 0.7D, 4.0D, 0.01D, ValueDisplay.Oliver);
      this.Jennifer = new BooleanSetting("Switch on Collison", true);
      this.Elizabeth = new BooleanSetting("Switch on Void", false);
      this.Linda = new NumberSetting("Void Distance", 5.0D, 1.0D, 100.0D, 0.1D, ValueDisplay.Oliver);
      this.Barbara = new NumberSetting("Keep Range", 2.5D, 0.1D, 10.0D, 0.01D, ValueDisplay.Oliver);
      this.Susan = new NumberSetting("Strafe Range", 6.0D, 1.0D, 10.0D, 0.01D, ValueDisplay.Oliver);
      this.Margaret = new NumberSetting("Speed", 0.3D, 0.05D, 1.0D, 0.01D, ValueDisplay.Oliver);
      this.Jessica = new NumberSetting("Jump Factor", 0.3D, 0.0D, 1.0D, 0.01D, ValueDisplay.Oliver);
      this.Jack = new BooleanSetting("Use Motions", true);
      this.Harry = new NumberSetting("Value for Y-Motion", 0.42D, 0.01D, 0.8D, 0.01D, ValueDisplay.Oliver);
      this.Jacob = new BooleanSetting("Jump Instead Of Motion", false);
      this.Charlie = 0;
      this.Thomas = null;
      this.George = Long.MAX_VALUE;
      this.Oscar = 1;
      this.James = 0;
      this.Oliver((Category)Category.Jack);
      this.addSetting(this.Barbara);
      this.addSetting(this.Susan);
      this.addSetting(this.Margaret);
      this.addSetting(this.Jessica);
      this.addSetting(this.Jennifer);
      this.addSetting(this.Elizabeth);
      this.addSetting(this.Linda);
      this.addSetting(this.William);
      this.addSetting(this.Mary);
      this.addSetting(this.Patricia);
      this.addSetting(this.Jack);
      this.addSetting(this.Harry);
      this.addSetting(this.Jacob);
      "".length();
      if ("  ".length() <= 0) {
         throw null;
      }
   }

   public void Oliver(JumpBoostEvent event) {
      if (this.Thomas()) {
         event.Oliver = RotationUtils.getYawToVec(this.Thomas.method_5829().method_1005());
      }

      "".length();
      if ((199 ^ 194) != 0) {
         ;
      }
   }

   public String Oliver() {
      String var1 = this.Margaret.William();
      "".length();
      return null != null ? null : var1;
   }

   public void Oliver(StrafeEvent event) {
      if (mc.field_1724 == null) {
         "".length();
         if ("  ".length() > "   ".length()) {
            return;
         }
      } else {
         ++this.Charlie;
         ++this.James;
         if (this.Thomas()) {
            float strafeYaw = RotationUtils.getYawToVec(this.Thomas.method_5829().method_1005());
            if (this.James > 1 && (mc.field_1724.field_5976 && this.Jennifer.Jack() || this.Elizabeth.Jack() && this.George())) {
               this.Oscar *= -1;
               this.James = 0;
            }

            double speed = (double)this.Margaret.George();
            if (this.William.Jack() && this.Charlie < this.Mary.Oscar()) {
               speed *= (double)this.Patricia.George();
            }

            if (mc.field_1690.field_1849.method_1434()) {
               this.Oscar = -1;
               mc.field_1690.field_1849.method_23481(false);
               "".length();
               if ("  ".length() == 0) {
                  return;
               }
            } else if (mc.field_1690.field_1913.method_1434()) {
               this.Oscar = 1;
               mc.field_1690.field_1913.method_23481(false);
            }

            double x = this.Thomas.method_23317() - mc.field_1724.method_23317();
            double z = this.Thomas.method_23321() - mc.field_1724.method_23321();
            float dist = (float)Math.hypot(x, z);
            if (llIlIIl(dist, this.Susan.George()) <= 0 && this.Thomas != null) {
               float rot = 90.0F - 45.0F * MathUtils.clamp(-2.0F, dist - this.Barbara.George(), 2.0F);
               float var10001;
               if (this.Oscar > 0) {
                  var10001 = -rot;
                  "".length();
                  if ("   ".length() < "".length()) {
                     return;
                  }
               } else {
                  var10001 = rot;
               }

               strafeYaw += var10001;
               this.Oliver(speed, strafeYaw);
               "".length();
               if (mc.field_1724.method_24828() && this.Jack.Jack()) {
                  if (this.Jacob.Jack()) {
                     mc.field_1724.method_6043();
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     MovementUtils.setMotionY((double)this.Harry.George());
                     float g = strafeYaw * 0.017453292F;
                     float jump = this.Jessica.George();
                     if (this.Charlie < this.Mary.Oscar()) {
                        jump *= this.Patricia.George();
                     }

                     mc.field_1724.method_18799(mc.field_1724.method_18798().method_1031((double)(-class_3532.method_15374(g) * jump), 0.0D, (double)(class_3532.method_15362(g) * jump)));
                  }
               }

               event.Oliver();
            }
         }

         "".length();
         if (null != null) {
            return;
         }
      }

   }

   protected void Charlie() {
      EVENT_MANAGER.Jack(StrafeEventListener.class, this);
      EVENT_MANAGER.Jack(JumpBoostEventListener.class, this);
      EVENT_MANAGER.Jack(PacketOutputListener.class, this);
      EVENT_MANAGER.Jack(KnockbackListener.class, this);
      "".length();
      if ((108 ^ 104) > 0) {
         ;
      }
   }

   public float Oliver(double speed, float yaw) {
      double x = -Math.sin(Math.toRadians((double)yaw));
      double z = Math.cos(Math.toRadians((double)yaw));
      class_243 velocity = mc.field_1724.method_18798();
      mc.field_1724.method_18800(x * speed, velocity.field_1351, z * speed);
      "".length();
      return " ".length() < -" ".length() ? 0.0F : yaw;
   }

   public void onSentPacket(PacketOutputEvent event) {
      if (event.Jacob() instanceof class_2824) {
         this.Thomas = ((class_2824)event.Jacob()).method_12248(mc.field_1687);
         this.George = System.currentTimeMillis();
      }

      "".length();
      if ((206 ^ 154 ^ 121 ^ 41) != "".length()) {
         ;
      }
   }

   static {
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int llIlIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void Oliver(KnockbackEvent event) {
      this.Charlie = 0;
      "".length();
      if (-" ".length() <= (91 ^ 126 ^ 170 ^ 139)) {
         ;
      }
   }

   private static int llIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private boolean George() {
      boolean var2;
      if (mc.field_1724 == null) {
         var2 = false;
         "".length();
         if ("   ".length() < 0) {
            return (boolean)"".length();
         }
      } else {
         int y = (int)mc.field_1724.method_19538().field_1351;

         while(true) {
            if (BlockUtils.getState(new class_2338(mc.field_1724.method_19538().field_1352, (double)y, mc.field_1724.method_19538().field_1350)).method_26207().method_15799()) {
               if (llIlIlI(mc.field_1724.method_19538().field_1351 - (double)y, (double)this.Linda.George()) < 0) {
                  var2 = false;
                  "".length();
                  if ("  ".length() < "".length()) {
                     return (boolean)"".length();
                  }
                  break;
               }
            } else if (llIlIll(mc.field_1724.method_19538().field_1351 - (double)y, (double)this.Linda.George()) > 0) {
               var2 = true;
               "".length();
               if (-" ".length() < -" ".length()) {
                  return (boolean)"".length();
               }
               break;
            }

            --y;
            "".length();
            if (null != null) {
               return (boolean)"".length();
            }
         }
      }

      return var2;
   }

   private static int llIlIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(StrafeEventListener.class, this);
      EVENT_MANAGER.Oliver(JumpBoostEventListener.class, this);
      EVENT_MANAGER.Oliver(PacketOutputListener.class, this);
      EVENT_MANAGER.Oliver(KnockbackListener.class, this);
      "".length();
      if (" ".length() <= "   ".length()) {
         ;
      }
   }
}
