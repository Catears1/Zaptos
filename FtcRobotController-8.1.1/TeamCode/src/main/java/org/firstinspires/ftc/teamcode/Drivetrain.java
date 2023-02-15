package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;


public class Drivetrain extends teleOp{
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;
    private double xSpeed;
    private double ySpeed;
    private double rotSpeed;

    public Drivetrain() {
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backRight = hardwareMap.get(DcMotor.class, "backRight");

        xSpeed = gamepad1.left_stick_x;
        ySpeed = -gamepad1.left_stick_y;
        rotSpeed = gamepad1.right_stick_x;


    }

    public void driveForward() {
        frontLeft.setPower(ySpeed);
        frontRight.setPower(-ySpeed);
        backLeft.setPower(ySpeed);
        backRight.setPower(-ySpeed);
    }

    public void strafe() {
        frontLeft.setPower(-xSpeed);
        frontRight.setPower(xSpeed);
        backLeft.setPower(xSpeed);
        backRight.setPower(-xSpeed);
    }

    public void rotate() {
        frontLeft.setPower(rotSpeed);
        frontRight.setPower(rotSpeed);
        backLeft.setPower(xSpeed);
        backRight.setPower(xSpeed);
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public double getrotSpeed() {
        return rotSpeed;
    }
}
