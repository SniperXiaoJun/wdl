composite_task foo {

  for ( item in items ) {
    step atask[version=0] {
      input: p0=alpha, p1=item;
      output: File("baz.txt") as gamma;
    }
  }
  
  step short_task[version=0] {
    output: File("foo.txt") as alpha;
  }
  
  step long_task[version=0] {
    output: File("bar.txt") as beta;
  }

  step batman[version=0] {}
  step robin[version=0] {}

  step generate_report[version=0] {
    input: p0=gamma, p1=epsilon;
    output: File("report.txt") as report;
  }

  for ( item in items ) {
    step btask[version=0] {
      input: p0=beta, p1=item;
      output: File("quux.txt") as epsilon;
    }
  }

}