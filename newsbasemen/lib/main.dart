import 'package:flutter/material.dart';
import 'package:newsbasemen/logical/RestartAppWidegt.dart';
import 'package:newsbasemen/ui/Homepage.dart';
import 'package:newsbasemen/ui/detailsPage.dart';

void main(){
  runApp(
    Restartappwidegt(child: Main())
    
  );
}

class Main extends StatelessWidget {
  const Main({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Homepage(),
      debugShowCheckedModeBanner: false,

    );
  }
}