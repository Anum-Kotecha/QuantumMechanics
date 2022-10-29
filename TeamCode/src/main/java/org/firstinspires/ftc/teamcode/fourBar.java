package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="MotorWorkie")
public class fourBar extends OpMode {
//declare the motor
    private DcMotor fourBar = null;


    @Override
    public void init() {
        //initialize
//Initialize the hardware variables
        fourBar = hardwareMap.get(DcMotor.class, "fourBar");
//set zero behaviors
        fourBar.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//set direction
        fourBar.setDirection(DcMotor.Direction.REVERSE);
//reset encoders for all the motors
        fourBar.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        fourBar.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    @Override
    public void loop() {
//run four bar
        if (gamepad2.y) {
            fourBar.setPower(.15);
        } else {
            fourBar.setPower(0);
        }

    }
}
