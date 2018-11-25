package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.VoltageSensor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;

import org.firstinspires.ftc.robotcore.external.Func;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class TelemetryData extends LinearOpMode {

    @Override
    public void runOpMode() {
        // Drive System
        FL = hardwareMap.get(DcMotor.class, "frontLeft");
        FR = hardwareMap.get(DcMotor.class, "frontRight");
        BL = hardwareMap.get(DcMotor.class, "backLeft");
        BR = hardwareMap.get(DcMotor.class, "backRight");

        FL.setDirection(DcMotorSimple.Direction.REVERSE);
        BL.setDirection(DcMotorSimple.Direction.REVERSE);

        // Sub-Systems
        actuator = hardwareMap.get(DcMotor.class, "actuator");
        shoulder = hardwareMap.get(Servo.class, "shoulder");
        elbow = hardwareMap.get(Servo.class, "elbow");
        wrist = hardwareMap.get(Servo.class, "wrist");
        intake = hardwareMap.get(CRServo.class, "intake");

        telemetry.addData("Actuator Position", "%s", Double.toString(actuator.getCurrentPositon()));

    }

}
