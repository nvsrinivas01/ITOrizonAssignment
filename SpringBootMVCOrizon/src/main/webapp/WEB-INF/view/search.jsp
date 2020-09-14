<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />

  <!-- Bootstrap CDN -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous" />

  <!-- External CSS Link -->

  <link rel="stylesheet" href="/css/formstyle.css" />

  

  <title>Search Car</title>
</head>

<body>
  <div class="container">
    <div class="row">
      <div class="col-lg-7">
        <h1 class="display-4 mt-5 mb-4"><u>Fill Any One Detail</u></h1>

        <div class="form-group">
          <table>
            <form action="processForm">

              <tr>
                <td><label for="">Model</label></td>
                <td><input type="text" name="model1" class="form-control" /></td>
                <td></td>
              </tr>


              <tr>
                <td><label for="">Color</label></td>
                <td><input type="text" name="color" class="form-control" /></td>
                <td></td>
              </tr>


              <tr>
                <td><label for="">Year Of Purchase</label></td>
                <td><input type="text" name="yop" class="form-control" placeholder="Example: YYYY" /> </td>
                <td></td>
              </tr>

              <tr>
                <td> <label for="">Price</label></td>
                <td><input type="text" name="price" class="form-control" /></td>
                <td></td>
              </tr>
              </tr>


              <tr>
                <td></td>

                <td><input type="submit" value="Submit" class="btn btn-primary align-left" /></td>

                <td><a href="/feature"><input type="button" value="Back" class="btn btn-primary" /></a></td>
              </tr>
              
            </form>
          </table>
        </div>
      </div>
    </div>
  </div>
</body>

</html>
