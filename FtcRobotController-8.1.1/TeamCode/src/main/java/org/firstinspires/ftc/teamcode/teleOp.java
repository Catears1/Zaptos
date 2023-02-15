package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Drivetrain;


@TeleOp

public class teleOp extends LinearOpMode {
    private Drivetrain drivetrain;


    public void runOpMode() {



        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            telemetry.addData("Status", "Running");
            telemetry.update();

            while (drivetrain.getySpeed() > 1) {
                drivetrain.driveForward();
            }

            while (drivetrain.getxSpeed() > 1) {
                drivetrain.strafe();
            }

            while (drivetrain.getrotSpeed() > 1) {
                drivetrain.rotate();
            }
        }
    }
}