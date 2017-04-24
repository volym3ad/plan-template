plan(key:'AWSTAGS',name:'LambdaCI AWS Tags checking and modifying') {
  project(key:'HCLC',name:'HipChat Lambda CI')

    stage(name:'Default Stage', manual: "false") {
      job(key:'JOB1',name:'Build',description:'Build artifacts for AWSLego') {

        task(type: 'script', description: 'Deployment AWS Stack ',
                    scriptBody : '''
virtualenv venv
source venv/bin/activate
pip install boto3
''')
      }
    }
}
